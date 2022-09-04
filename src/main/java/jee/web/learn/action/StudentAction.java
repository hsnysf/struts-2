package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import jee.web.model.Student;

@Action("student")
@Results({
	@Result(name = "input", location = "/student.jsp"),
	@Result(name = "success", location = "/student-details.jsp")
})
public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String execute() throws Exception {
		
		System.out.println(student);
		
		return INPUT;
	}
	
	@Action("saveStudent")
	public String saveStudent() throws Exception {
		
		System.out.println(student);
		
		return SUCCESS;
	}
}
