package Encapsulation;

public class order_driver {

	public static void main(String[] args) {
		Order o1=new Order("Camera ",1234,50000,"Paytm");
		System.err.println(o1.getp_name());
		System.out.println(o1.getp_id());
		System.out.println(o1.getprice());
		System.out.println(o1.getpayment());
		System.out.println("~~~~~~~~~~~~~");
		
		o1.setp_name("Samsung ");
		o1.setp_id(854637299999l);
		o1.setprice(50500);
		o1.setpayment("phone pay");
		
		System.err.println(o1.getp_name());
		System.out.println(o1.getp_id());
		System.out.println(o1.getprice());
		System.out.println(o1.getpayment());
		System.out.println("~~~~~~~~~~~~~");
	
		
		o1.setp_name("One plus");
		o1.setp_id(8599l);
		o1.setprice(30000);
		o1.setpayment("G pay");
		
		System.err.println(o1.getp_name());
		System.out.println(o1.getp_id());
		System.out.println(o1.getprice());
		System.out.println(o1.getpayment());

	}

}
