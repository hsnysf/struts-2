package jee.web.learn.action;

import java.util.Locale;
import java.util.Map;

import org.apache.struts2.interceptor.I18nInterceptor;

import com.opensymphony.xwork2.ActionContext;

public class HomeAction {

	public String execute() {
		
		//ActionContext.getContext().setLocale(new Locale("ar", "ar"));

		System.out.println(ActionContext.getContext().getLocale());
		
		Map<String, Object> session = ActionContext.getContext().getSession();

		session.put(I18nInterceptor.DEFAULT_SESSION_ATTRIBUTE, new Locale("ar"));
		
		System.out.println(session.get(I18nInterceptor.DEFAULT_SESSION_ATTRIBUTE));
		
		System.out.println("Home Page from Action");
		
		return "home";
	}
}
