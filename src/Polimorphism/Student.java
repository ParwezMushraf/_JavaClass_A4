package Polimorphism;

public class Student extends Human {
	public void acting(String s1) {
		System.out.println(s1+" Some how Studying ");
	}
	
	public void money() {
		System.out.println("money 1000 ");
	}
	
	public static void main(String[] args) {
		Human s2=new Student();
		s2.acting("Ahi");
		s2.set();
		
	}
}
