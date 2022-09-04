package jee.web.learn.action;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

@Action("dep")
public class DepartmentAction {

	public void execute() throws IOException {
		
		System.out.println("Department Page");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		ServletContext context = ServletActionContext.getServletContext();
		Map<String, Object> session = ActionContext.getContext().getSession();
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		HttpParameters parameters = ActionContext.getContext().getParameters();
		
		response.getWriter().println("Welcome " + request.getParameter("name"));
		response.getWriter().println("Welcome " + parameters.get("name"));
		
		session.put("user", "Mohd");
		context.setAttribute("countries", Arrays.asList("KSA", "Qatar"));
		
		valueStack.setValue("dep", "IT");
	}
	
	@Action("emp-count")
	public void getEmployeeCount() {
		
		System.out.println("Employee Count");
	}
}
