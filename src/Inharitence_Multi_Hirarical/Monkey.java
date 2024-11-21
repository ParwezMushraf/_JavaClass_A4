package Inharitence_Multi_Hirarical;

public class Monkey extends Animal{

	String name="monkey";
	String birth="1 monkey";
	double cost=2000;
	int age=15;
	
	public static void main(String[] args) {
		Monkey m1=new Monkey();
		
		m1.Sound="Keech";
		m1.food="fruits";
		pets(m1.name);
		
		System.out.println("Your Animal is "+m1.name);
		System.out.println(m1.name+" Sound is "+m1.Sound);
		System.out.println(m1.name+" It can give a birth to "+m1.birth);
		System.out.println("Cost is "+m1.cost);
		System.out.println("Age of "+m1.name+" is "+m1.age);
		
	}
}
