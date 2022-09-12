package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

@ParentPackage("admin")
@Namespace("/admin")
@Action("ui")
public class LookAndFeelAction {

	public void execute() {
		
		System.out.println("Look and Feel Admin");
	}
}
