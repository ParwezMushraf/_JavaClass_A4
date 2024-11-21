package Inharitence;

public class IPhone_11 extends IPhone_10{
	
	public static void battery() {
		System.out.println("Good battery ");
	}

	public static void main() {
		IPhone_11 i1=new IPhone_11();
		System.out.println(i1.name);
		System.out.println(i1.price);
		System.out.println(i1.colour);
		camera();
		i1.battery();
		
	}

}
