package jee.web.model;

public class Address {

	private int block;
	private String city;
	
	public int getBlock() {
		return block;
	}
	
	public void setBlock(int block) {
		this.block = block;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[block=" + block + ", city=" + city + "]";
	}
}
