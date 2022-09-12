package jee.web.learn.action;

import java.util.Locale;
import java.util.Map;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.interceptor.I18nInterceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

@InterceptorRef("defaultStack")
public class Login implements Action{

	private String language;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("Login Page");
		
		ActionContext.getContext().setLocale(new Locale(language));
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		session.put(I18nInterceptor.DEFAULT_SESSION_ATTRIBUTE, new Locale(language));
		
		session.put("user", "mohd");
		
		return null;
	}

	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
}
