package Encapsulation;

public class Account {
	private String Ac_holder_name;
	private long Ac_no;
	private double balance;
	
	public Account(String name,long no,double balance) {
		Ac_holder_name=name;
		Ac_no=no;
		this.balance=balance;
	}

	public String getAc_holder_name() {
		return Ac_holder_name;
	}

	public void setAc_holder_name(String ac_holder_name) {
		Ac_holder_name = ac_holder_name;
	}

	public long getAc_no() {
		return Ac_no;
	}

	public void setAc_no(long ac_no) {
		Ac_no = ac_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
