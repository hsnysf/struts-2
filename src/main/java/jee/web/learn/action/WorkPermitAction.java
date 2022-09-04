package jee.web.learn.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import jee.web.model.WorkPermit;

@Action("work-permit")
@Results({
	@Result(name = "input", location = "/apply-work-permit.jsp"),
	@Result(name = "success", location = "/work-permit-details.jsp")
})
public class WorkPermitAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;
	
	//@Valid
	private WorkPermit workPermit = new WorkPermit();
	
	@Override
	public void prepare() throws Exception {
		
		System.out.println("prepare :: " + workPermit);
	}
	
	@Override
	public void validate() {
		
		System.out.println("validate :: " + workPermit);
		
		//1. fields errors
		//2. action errors
		
		if(workPermit.getCpr() == null || workPermit.getCpr().trim().length() == 0) {
			
			//addFieldError("workPermit.cpr", "CPR is required");
			addFieldError("workPermit.cpr", getText("work.permit.cpr.required"));
			
		}else if(workPermit.getCpr().length() != 9) {
			
			//addFieldError("workPermit.cpr", "CPR should be 9 digits");
			addFieldError("workPermit.cpr", getText("work.permit.cpr.length"));
		}
		
		if(workPermit.getName() == null || workPermit.getName().trim().length() == 0) {
			
			//addFieldError("workPermit.name", "Name is required");
			addFieldError("workPermit.name", getText("work.permit.name.required"));
		}
		
		if(workPermit.getMobile() == null || workPermit.getMobile().trim().length() == 0) {
			
			//addFieldError("workPermit.mobile", "Mobile is required");
			addFieldError("workPermit.mobile", getText("work.permit.mobile.required"));
			
		}else if(workPermit.getMobile().length() != 8) {
			
			//addFieldError("workPermit.mobile", "Mobile should be 8 digits");
			addFieldError("workPermit.mobile", getText("work.permit.mobile.length"));
		}
		
		if(workPermit.getEmail() == null || workPermit.getEmail().trim().length() == 0) {
			
			//addFieldError("workPermit.email", "Email is required");
			addFieldError("workPermit.email", getText("work.permit.email.required"));
			
		}else if(!workPermit.getEmail().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
			
			//addFieldError("workPermit.email", "Email is invalid");
			//addFieldError("workPermit.email", getText("work.permit.email.invalid"));
		}
		
		if(workPermit.getAge() == 0) {
			
			//addFieldError("workPermit.age", "Age is required");
			addFieldError("workPermit.age", getText("work.permit.age.required"));
			
		}else if(!(workPermit.getAge() >= 1 && workPermit.getAge() <= 120)) {
			
			//addFieldError("workPermit.age", "Age should be between 1 and 120");
			addFieldError("workPermit.age", getText("work.permit.age.between"));
		}
		
		if(workPermit.getGender() == null || workPermit.getGender().trim().length() == 0) {
			
			//addFieldError("workPermit.gender", "Gender is required");
			addFieldError("workPermit.gender", getText("work.permit.gender.required"));
		}
		
		if(workPermit.getUrl() == null || workPermit.getUrl().trim().length() == 0) {
			
			//addFieldError("workPermit.url", "URL is required");
			addFieldError("workPermit.url", getText("work.permit.url.required"));
			
		}else if(!workPermit.getUrl().matches("((http?|https|ftp|file)://)?((W|w){3}.)?[a-zA-Z0-9]+\\.[a-zA-Z]+")){
			
			//addFieldError("workPermit.url", "URL is invalid");
			addFieldError("workPermit.url", getText("work.permit.url.invalid"));
		}
		
		if(workPermit.getCommunications() == null || workPermit.getCommunications().size() == 0) {
			
			//addFieldError("workPermit.communications", "Communications is required");
			addFieldError("workPermit.communications", getText("work.permit.communications.required"));
		}

		if(workPermit.getServiceType() == null || workPermit.getServiceType().trim().length() == 0) {
			
			//addFieldError("workPermit.serviceType", "Service Type is required");
			addFieldError("workPermit.serviceType", getText("work.permit.service.type.required"));
		}
		
		for(List<String> errors : getFieldErrors().values()) {
			
			for(String error : errors) {
				
				addActionError(error);
			}
		}
	}
	
	@Action("apply-work-permit")
	public String applyWorkPermit() {
		
		System.out.println("applyWorkPermit :: " + workPermit);
		
		return INPUT;
	}
	
	@Action("work-permit-details")
	public String workPermitDetails() {
		
		//addActionMessage("Work Permit has been applied successfully");
		addActionMessage(getText("work.permit.success"));
		
		System.out.println("applyWorkPermit :: " + workPermit);
		
		return SUCCESS;
	}
	
	public WorkPermit getWorkPermit() {
		return workPermit;
	}
	
	public void setWorkPermit(WorkPermit workPermit) {
		this.workPermit = workPermit;
	}
}
