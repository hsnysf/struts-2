package jee.web.learn.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import jee.web.model.Student;

@Action("student-model-driven")
@Results({
	@Result(name = "student", location = "/student-model-driven.jsp"),
	@Result(name = "student-details", location = "/student-details-model-driven.jsp")
})
public class StudentModelDrivenAction extends ActionSupport implements Preparable, ModelDriven<Student> {

	private static final long serialVersionUID = 1L;
	
	private Student student = new Student();
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public Student getModel() {
		
		System.out.println("getModel()" + student);
		
		return student;
	}

	@Override
	public void prepare() throws Exception {
		
		System.out.println("prepare()" + student);
	}
	
	@Override
	public void validate() {
		
		System.out.println("validate()" + student);
	}
	
	public String execute() throws Exception {
		
		System.out.println("execute()" + student);
		
		return "student";
	}
	
	@Action("saveStudent")
	public String saveStudent() throws Exception {
		
		System.out.println(student);
		
		return "student-details";
	}
}
