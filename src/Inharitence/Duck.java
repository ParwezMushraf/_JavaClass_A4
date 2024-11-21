package Inharitence;

public class Duck extends Bird {

	String Colour="Duck";
	int age=5;
	
	public static void main(String[] args) {
		Duck d1=new Duck();
		
		System.out.println(d1.canswimm);
		System.out.println(d1.canfly);
		d1.warmblood();
		System.out.println(d1.Colour);
		System.out.println(d1.age);
	}
}
