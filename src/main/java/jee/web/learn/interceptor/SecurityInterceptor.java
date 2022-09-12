package jee.web.learn.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecurityInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		//if(session.containsKey("user")) {
			return invocation.invoke();
		//}else {
		//	return "unauthorized";
		//}
	}
}
