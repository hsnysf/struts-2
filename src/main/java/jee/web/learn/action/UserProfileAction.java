package jee.web.learn.action;

import org.apache.struts2.convention.annotation.InterceptorRef;

@InterceptorRef("second-interceptor")
public class UserProfileAction {

	public void execute() {
		
		System.out.println("User Profile Page");
	}
}
