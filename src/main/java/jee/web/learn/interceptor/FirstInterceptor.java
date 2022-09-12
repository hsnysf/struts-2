package jee.web.learn.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("FirstInterceptor intercept start " + invocation.getAction());
		
		String result = invocation.invoke();
		
		System.out.println("FirstInterceptor intercept end " + invocation.getAction());
		
		return result;
	}
}
