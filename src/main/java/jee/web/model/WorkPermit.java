package jee.web.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class WorkPermit {

	private int id;
	@Pattern(regexp = "\\d{9}", message = "work.permit.cpr.length")
	@NotBlank(message = "work.permit.cpr.required")
	private String cpr;
	@NotBlank(message = "work.permit.name.required")
	private String name;
	@Pattern(regexp = "\\d{8}", message = "work.permit.mobile.length")
	@NotBlank(message = "work.permit.mobile.required")
	private String mobile;
	@Min(value = 1, message = "work.permit.age.between")
	@Max(value = 120, message = "work.permit.age.between")
	private int age;
	@Email(message = "work.permit.email.invalid")
	@NotBlank(message = "work.permit.email.required")
	private String email;
	@Pattern(regexp = "((http?|https|ftp|file)://)?((W|w){3}.)?[a-zA-Z0-9]+\\.[a-zA-Z]+", message = "work.permit.url.invalid")
	@NotBlank(message = "work.permit.url.required")
	private String url;
	@NotBlank(message = "work.permit.gender.required")
	private String gender;
	@NotEmpty(message = "work.permit.communications.required")
	private List<String> communications;
	@NotBlank(message = "work.permit.service.type.required")
	private String serviceType;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCpr() {
		return cpr;
	}
	
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public List<String> getCommunications() {
		return communications;
	}
	
	public void setCommunications(List<String> communications) {
		this.communications = communications;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", cpr=" + cpr + ", name=" + name + ", mobile=" + mobile + ", age=" + age
				+ ", email=" + email + ", url=" + url + ", gender=" + gender + ", communications=" + communications
				+ ", serviceType=" + serviceType + "]";
	}
}
