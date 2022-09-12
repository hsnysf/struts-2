package jee.web.learn.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecondInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("SecondInterceptor intercept start " + invocation.getAction());
		
		String result = invocation.invoke();
		
		System.out.println("SecondInterceptor intercept end" + invocation.getAction());
		
		return result;
	}
}
