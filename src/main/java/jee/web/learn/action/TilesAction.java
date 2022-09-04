package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Action;

@Action("tiles")
//@Result(name="layout", type = "tiles", location = "layout")
public class TilesAction {

	private String page = "/change-password.jsp";
	private String title = "Change User Password";
	
	public String toPage(String page, String title) {
		this.page = page;
		this.title = title;
		return "layout";
	}
	
	public String execute() {
		
		return toPage("/change-password.jsp", "Change User Password");
	}
	
	public String getPage() {
		return page;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
