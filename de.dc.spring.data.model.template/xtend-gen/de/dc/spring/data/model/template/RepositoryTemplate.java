package de.dc.spring.data.model.template;

import de.dc.spring.data.model.spdat.Repository;
import de.dc.spring.data.model.spdat.SpringProject;
import de.dc.spring.data.model.template.IGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RepositoryTemplate implements IGenerator<Repository> {
  @Override
  public String gen(final Repository data) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = data.eContainer();
    final SpringProject project = ((SpringProject) _eContainer);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = project.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".");
    String _path = data.getPath();
    _builder.append(_path);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = project.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".");
    String _path_1 = data.getAssociatedData().getPath();
    _builder.append(_path_1);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(data.getName());
    _builder.append(_firstUpper);
    _builder.append("Repository extends JpaRepository<");
    String _name = data.getAssociatedData().getName();
    _builder.append(_name);
    _builder.append(", Long>{");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
