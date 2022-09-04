package jee.web.model;

import java.util.List;

public class Application {

	private int id;
	private String cpr;
	private String name;
	private String mobile;
	private String email;
	private String url;
	private String gender;
	private List<String> communication;
	private String type;
	
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

	public List<String> getCommunication() {
		return communication;
	}

	public void setCommunication(List<String> communication) {
		this.communication = communication;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
