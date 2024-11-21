package Encapsulation;

public class BagDriver {

	public static void main(String[] args) {
		Bag b1=new Bag("HP",700,"Black","Small");
			
		System.out.println(b1.getbrand());
		System.out.println(b1.getprice());
		System.out.println(b1.getcolour());
		System.out.println(b1.gettype());
		System.out.println("~~~~~~~~~~~~~~~");
		
		b1.setbrand("Dell");
		b1.setprice(4000);
		b1.setcolour("Blue ");
		b1.settype("Mid");
		
		System.out.println(b1.getbrand());
//		System.out.println(b1.getprice());
//		System.out.println(b1.getcolour());
//		System.out.println(b1.gettype());
	}
}