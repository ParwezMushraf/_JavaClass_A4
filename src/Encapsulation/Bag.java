package Encapsulation;

public class Bag {
	
	private String brand;
	private double price;
	private String colour;
	private String type;
	
	public Bag(String brand, double price, String colour, String type) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.type=type;
	}
	
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		if(brand=="HP" && brand=="Dell") {
		   this.brand=brand;
		}else {
			System.out.println("Not Possible ");
		}
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		if(price>=500) {
		this.price=price;
		}else {
			System.out.println("Not Possible ");
		}
	}
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour=colour;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type=type;
	}
	
}
