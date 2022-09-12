package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

//@Action("/")
@Action("index")
@Result(name = ActionSupport.SUCCESS, location = "/main.jsp")
public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {
		
		System.out.println("Index Root Page");
		
		return SUCCESS;
	}
}
