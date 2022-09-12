package jee.web.model;

public class Department {

	private int id;
	private String name;
	private int floor;
	
	public Department(int id, String name, int floor) {
		this.id = id;
		this.name = name;
		this.floor = floor;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
}
