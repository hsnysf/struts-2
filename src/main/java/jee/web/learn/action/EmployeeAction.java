package jee.web.learn.action;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;

@Action("employee")
@Results({
	@Result(name = ActionSupport.INPUT, type = "dispatcher", location = "/employee.jsp"),
	@Result(name = ActionSupport.SUCCESS, type = "dispatcher", location = "/employee-details.jsp")
})
public class EmployeeAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	ServletContext context = ServletActionContext.getServletContext();
	Map<String, Object> session = ActionContext.getContext().getSession();
	ValueStack valueStack = ActionContext.getContext().getValueStack();
	HttpParameters parameters = ActionContext.getContext().getParameters();
	
	private String name;
	private int age;
	private double salary;
	private boolean highPerformance;
	private List<String> diseases;
	private List<String> skills;
	private List<String> skillList = Arrays.asList("Java", "C#", "Postgres", "Node JS");
	private String gender;
	private String department;
	private List<String> departments = Arrays.asList("IT", "Operation", "Customer Service", "Inspection");
	private boolean leave;
	private String role;
	private List<String> roles = Arrays.asList("Junior", "Senior", "Leader", "Supervisor", "Manager");
	private List<String> hobbies;
	private String profile;
	private String password;
	private File passport;
	private String passportFileName;
	private String passportContentType;
	private String passportContent;
	private List<File> certificates;
	private List<String> certificatesFileName;
	private List<String> certificatesContentType;
	private List<String> certificatesContent;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		System.out.println("Set Name " + name);
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		System.out.println("Set Age " + age);
		
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		
		System.out.println("Set Salary " + salary);
		
		this.salary = salary;
	}

	public boolean isHighPerformance() {
		return highPerformance;
	}

	public void setHighPerformance(boolean highPerformance) {
		
		System.out.println("Set highPerformance " + highPerformance);
		
		this.highPerformance = highPerformance;
	}
	
	public List<String> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<String> diseases) {
		this.diseases = diseases;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public boolean isLeave() {
		return leave;
	}

	public void setLeave(boolean leave) {
		this.leave = leave;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public File getPassport() {
		return passport;
	}

	public void setPassport(File passport) {
		this.passport = passport;
	}

	public String getPassportFileName() {
		return passportFileName;
	}

	public void setPassportFileName(String passportFileName) {
		this.passportFileName = passportFileName;
	}

	public String getPassportContentType() {
		return passportContentType;
	}

	public void setPassportContentType(String passportContentType) {
		this.passportContentType = passportContentType;
	}

	public String getPassportContent() {
		return passportContent;
	}

	public void setPassportContent(String passportContent) {
		this.passportContent = passportContent;
	}

	public List<File> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<File> certificates) {
		this.certificates = certificates;
	}

	public List<String> getCertificatesFileName() {
		return certificatesFileName;
	}

	public void setCertificatesFileName(List<String> certificatesFileName) {
		this.certificatesFileName = certificatesFileName;
	}

	public List<String> getCertificatesContentType() {
		return certificatesContentType;
	}

	public void setCertificatesContentType(List<String> certificatesContentType) {
		this.certificatesContentType = certificatesContentType;
	}

	public List<String> getCertificatesContent() {
		return certificatesContent;
	}

	public void setCertificatesContent(List<String> certificatesContent) {
		this.certificatesContent = certificatesContent;
	}

	public EmployeeAction() {
		
		System.out.println("EmployeeAction() Name of Employee is " + name);
		System.out.println("EmployeeAction() Age of Employee is " + age);
		System.out.println("EmployeeAction() Salary of Employee is " + salary);
		System.out.println("EmployeeAction() Performance of Employee is " + highPerformance);
	}
	
	@Override
	public void prepare() throws Exception {
		
		System.out.println("prepare() Name of Employee is " + name);
		System.out.println("prepare() Age of Employee is " + age);
		System.out.println("prepare() Salary of Employee is " + salary);
		System.out.println("prepare() Performance of Employee is " + highPerformance);
	}
	
	@Override
	public void validate() {
		
		System.out.println("validate() Name of Employee is " + name);
		System.out.println("validate() Age of Employee is " + age);
		System.out.println("validate() Salary of Employee is " + salary);
		System.out.println("validate() Performance of Employee is " + highPerformance);
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("execute() Name of Employee is " + name);
		System.out.println("execute() Age of Employee is " + age);
		System.out.println("execute() Salary of Employee is " + salary);
		System.out.println("execute() Performance of Employee is " + highPerformance);
		
		departments = Arrays.asList(getText("employee.it"), 
				getText("employee.operation"), 
				getText("employee.customer.service"), 
				getText("employee.inspection"));

		roles = Arrays.asList(getText("employee.junior"), 
			getText("employee.senior"), 
			getText("employee.leader"), 
			getText("employee.supervisor"), 
			getText("employee.manager"));
		
		//name = "Ali";
		age = 30;
		salary = 300.54;
		highPerformance = true;
		diseases = Arrays.asList("Disease 1", "Disease 3");
		skills = Arrays.asList("Java", "Node JS");
		gender = "Male";
		department = "Operation";
		leave = false;
		role = "Leader";
		hobbies = Arrays.asList("Draw");
		profile = "Test";
		password = "test@1234";
		
		return INPUT;
	}
	
	@Action("saveEmployee")
	public String saveEmployee() throws Exception {
		
		if(passport != null) {
			
			passportContent = Base64.getEncoder().encodeToString(Files.readAllBytes(passport.toPath()));
		}
		
		if(certificates != null) {
			
			certificatesContent = new ArrayList<String>();
			
			for(File certificate : certificates) {
				
				certificatesContent.add(Base64.getEncoder().encodeToString(Files.readAllBytes(certificate.toPath())));
			}
		}

		return SUCCESS;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + ", highPerformance="
				+ highPerformance + ", diseases=" + diseases + ", skills=" + skills + ", skillList=" + skillList
				+ ", gender=" + gender + ", department=" + department + ", departments=" + departments + ", leave="
				+ leave + ", role=" + role + ", roles=" + roles + ", hobbies=" + hobbies + ", profile=" + profile
				+ ", password=" + password + ", passport=" + passport + ", passportFileName=" + passportFileName
				+ ", passportContentType=" + passportContentType + ", passportContent=" + passportContent
				+ ", certificates=" + certificates + ", certificatesFileName=" + certificatesFileName
				+ ", certificatesContentType=" + certificatesContentType + ", certificatesContent="
				+ certificatesContent + "]";
	}
}