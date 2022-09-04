package jee.web.learn.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import jee.web.learn.exception.OffenseException;

@Action("new-visa")
/*
@ExceptionMappings({
	@ExceptionMapping(result = "offense", exception = "jee.web.learn.exception.OffenseException"),
	@ExceptionMapping(result = "error", exception = "java.lang.RuntimeException")
})
@Results({
	
	@Result(name = "offense", location = "/offense.jsp"),
	@Result(name = "error", location = "/error.jsp")
})
*/
public class NewVisaAction {

	HttpServletResponse response = ServletActionContext.getResponse();
	
	private boolean offense;
	
	public void execute() throws Exception {
		
		//System.out.println(5/0);
		
		if(offense) {
			
			throw new OffenseException();
		}
		
		response.getWriter().println("Visa Applied Successfully");
	}
	
	public boolean isOffense() {
		return offense;
	}
	
	public void setOffense(boolean offense) {
		this.offense = offense;
	}
}
