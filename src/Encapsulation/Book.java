package Encapsulation;

public class Book {
	private String name;
	
	protected Book(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
}
