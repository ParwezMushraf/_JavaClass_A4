package Inharitence_Multi_Hirarical;

public class Cat extends Animal{
	
	String name="cat";
	String birth="2 Kittens";
	double cost=1500;
	int age=7;
	
	public static void main(String[] args) {
		Cat c1=new Cat();
		
		c1.Sound="Meow";
		c1.food="Milk";
		pets(c1.name);
		
		System.out.println("Your Animal is "+c1.name);
		System.out.println(c1.name+" Sound is "+c1.Sound);
		System.out.println(c1.name+" It can give a birth to "+c1.birth);
		System.out.println("Cost is "+c1.cost);
		System.out.println("Age of "+c1.name+" is "+c1.age);
		
	}
	
}
