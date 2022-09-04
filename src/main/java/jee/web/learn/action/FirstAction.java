package jee.web.learn.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//Params not working for chain
//@Result(name = "second", type = "chain", location = "second", params = {"message", "Java"})
//Params will work for redirectAction
//@Result(name = "second", type = "redirectAction", location = "second", params = {"message", "Java"})
//@Result(name = "second", type = "redirectAction", location = "second", params = {"message", "%{message}", "sourceMessage", "%{actionMessages}", "sourceError", "%{actionErrors}"})
@Result(name = "second", type = "redirect", location = "http://www.google.com")
public class FirstAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public String execute() {
		
		//Will reach second action but will not override parameter
		message = "ASP.NET";
		
		Map<String, Parameter> params = new HashMap<String, Parameter>();
		params.put("message", new Parameter.Request("message", "ASP.NET"));
				
		HttpParameters parameters = ActionContext.getContext().getParameters();
		parameters.appendAll(params);
		
		addActionMessage("Message from First Action");
		
		addActionError("Error from First Action");
		
		return "second";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
