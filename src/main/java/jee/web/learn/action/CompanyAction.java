package jee.web.learn.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import jee.web.model.Department;

@Action("company")
//@Result(name = "success", type = "json", params = {"root", "departments"})
public class CompanyAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private List<Department> departments = Arrays.asList(new Department(1, "IT", 5),
			new Department(2, "HR", 6),
			new Department(3, "Operation", 7));
	
	public List<Department> getDepartments() {
		return departments;
	}
	
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
}
