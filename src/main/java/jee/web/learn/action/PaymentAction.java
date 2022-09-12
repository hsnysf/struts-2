package jee.web.learn.action;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@InterceptorRefs({
	@InterceptorRef("learnStack"),
	@InterceptorRef("token")
})
@Result(name = ActionSupport.SUCCESS, location = "/payment-success.jsp")
public class PaymentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private double amount;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("Update amount in database");
		
		return SUCCESS;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
}

