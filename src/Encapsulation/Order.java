package Encapsulation;

import java.util.Set;

public class Order {
		
	private String p_name;
	private long p_id;
	private double price;
	private String payment;
	
	public Order(String name,long id,double price,String payment) {
		p_name=name;
		p_id=id;
		this.price=price;
		this.payment=payment;
		
		
	}
	public String getp_name() {
		return p_name;
	}
	public long getp_id() {
		return p_id;
	}
	public double getprice() {
		return price;
	}
	public String getpayment() {
		return payment;
	}
	
	public void setp_name(String p_name) {
		this.p_name=p_name;
	}
	
	public void setp_id(long p_id) {
		this.p_id=p_id;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setpayment(String payment) {
		this.payment=payment;
	}
	
}
