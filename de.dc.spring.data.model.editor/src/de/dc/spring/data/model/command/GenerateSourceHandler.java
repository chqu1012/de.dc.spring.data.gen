package de.dc.spring.data.model.command;


import java.util.List;

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

import de.dc.spring.data.model.command.generator.DataGenerator;
import de.dc.spring.data.model.command.generator.RepositoryGenerator;
import de.dc.spring.data.model.spdat.Data;
import de.dc.spring.data.model.spdat.Repository;

public class GenerateSourceHandler extends AbstractHandler {

	protected DataGenerator dataGenerater = new DataGenerator();
	protected RepositoryGenerator repoGenerator = new RepositoryGenerator();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		if (selectionService.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selectionService.getSelection();
			IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			IEditorInput input = activeEditor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				IFileEditorInput fileEditorInput = (IFileEditorInput) input;
				IFile file = fileEditorInput.getFile();
				IProject project = file.getProject();
				
				List<?> selections = ss.toList();
				for (Object object : selections) {
					if (object instanceof Data) {
						dataGenerater.gen((Data) object, project);
					}else if (object instanceof Repository) {
						repoGenerator.gen((Repository) object, project);
					}
					
				}
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
