package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Result(name = "second", location = "/second.jsp")
public class SecondAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String message;
	private String sourceMessage;
	private String sourceError;
	
	public String execute() {
		
		System.out.println("message in second action " + message);
		
		if(sourceMessage != null && sourceMessage.trim().length() != 0) {
			
			addActionMessage(sourceMessage);
		}
		
		if(sourceError != null && sourceError.trim().length() != 0) {
			
			addActionError(sourceError);
		}
		
		return "second";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSourceMessage() {
		return sourceMessage;
	}
	
	public void setSourceMessage(String sourceMessage) {
		this.sourceMessage = sourceMessage;
	}
	
	public String getSourceError() {
		return sourceError;
	}
	
	public void setSourceError(String sourceError) {
		this.sourceError = sourceError;
	}
}
