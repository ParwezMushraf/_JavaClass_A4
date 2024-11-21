package Inharitence_Multi_Hirarical;

public class Dog extends Animal {
	String name="dog";
	String birth="4";
	double cost=3000;
	int age=11;
	
	public static void main(String[] args) {
		Dog d1=new Dog();
		
		d1.Sound="Bhav-Bhav";
		d1.food="Meet";
		pets(d1.name);
		
		System.out.println("Your Animal is "+d1.name);
		System.out.println(d1.name+" Sound is "+d1.Sound);
		System.out.println(d1.name+" It can give a Born to "+d1.birth+" PUPPY");
		System.out.println("Cost is"+d1.cost);
		System.out.println("Age of "+d1.name+" is "+d1.age);
	}
}
