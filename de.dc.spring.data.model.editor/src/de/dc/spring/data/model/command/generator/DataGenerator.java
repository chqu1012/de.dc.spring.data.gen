package de.dc.spring.data.model.command.generator;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import de.dc.spring.data.model.spdat.Data;
import de.dc.spring.data.model.spdat.SpringProject;
import de.dc.spring.data.model.template.DataTemplate;

public class DataGenerator extends AbstractGenerator<Data> {

	private DataTemplate template = new DataTemplate();
	
	@Override
	public void gen(Data input, IProject project) {
		String srcPath = getLocation(project, input);
		String content = template.gen(input);
		new File(srcPath).mkdirs();
		String genFilePath =  srcPath+"/"+input.getName()+".java";
		writeFile(genFilePath, content);
	}
	
	private String getLocation(IProject project, Data data) {
		IFolder folder = project.getFolder("src");
		if (!folder.exists()) {
			try {
				folder.create(IResource.FORCE, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		SpringProject eContainer = (SpringProject) data.eContainer();
		return folder.getLocation().toOSString()+"/"+eContainer.getPackagePath().replaceAll("\\.", "/")+"/"+data.getPath();
	}
}
