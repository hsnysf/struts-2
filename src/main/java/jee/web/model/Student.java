package jee.web.model;

import java.util.List;

public class Student {

	private int cpr;
	private String name;
	private Address address;
	private List<Certificate> certificates;
	
	public int getCpr() {
		return cpr;
	}

	public void setCpr(int cpr) {
		this.cpr = cpr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Certificate> getCertificates() {
		return certificates;
	}
	
	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "[cpr=" + cpr + ", name=" + name + ", address=" + address + ", certificates=" + certificates + "]";
	}
}
