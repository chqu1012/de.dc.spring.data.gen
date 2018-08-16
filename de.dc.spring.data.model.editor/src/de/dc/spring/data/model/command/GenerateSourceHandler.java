package de.dc.spring.data.model.command;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

import de.dc.spring.data.model.command.generator.DataGenerator;
import de.dc.spring.data.model.spdat.Data;

public class GenerateSourceHandler extends AbstractHandler {

	protected DataGenerator generator = new DataGenerator();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		if (selectionService.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selectionService.getSelection();
			IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IEditorInput input = activeEditor.getEditorInput();
			IFile file2 = ResourceUtil.getFile(input);
			System.out.println(file2);
			if (input instanceof IFileEditorInput) {
				IFileEditorInput fileEditorInput = (IFileEditorInput) input;
				IFile file = fileEditorInput.getFile();
				IProject project = file.getProject();
				if (ss.getFirstElement() instanceof Data) {
					generator.gen((Data) ss.getFirstElement(), project);
				}
//				if (ss.getFirstElement() instanceof FXTableView) {
//					FXTableView view = (FXTableView) ss.getFirstElement();
//					tableViewGenerator.gen(view, project);
//				}else if (ss.getFirstElement() instanceof FXForm) {
//					FXForm form = (FXForm) ss.getFirstElement();
//					formGenerator.gen(form, project);
//				}
				refresh(project);
			}
		}
		return null;
	}

	private void refresh(IProject project) {
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
