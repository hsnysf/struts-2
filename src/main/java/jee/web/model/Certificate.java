package jee.web.model;

public class Certificate {

	private String title;
	private int year;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", year=" + year + "]";
	}
}
