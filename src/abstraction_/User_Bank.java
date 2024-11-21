package abstraction_;

public class User_Bank {

	public static void call(Bank b1) {
		b1.ROI();
		b1.withdraw();
	}
	public static void main(String[] args) {
		call(new SBI());
		call(new ICICI());
		call(new Bank_Of_Baroda());
	}
}
