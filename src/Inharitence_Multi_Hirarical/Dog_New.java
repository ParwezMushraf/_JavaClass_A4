package Inharitence_Multi_Hirarical;

public class Dog_New extends Animal_New{

	public void sound(String name) {
		super.sound(name);
		System.out.println("Sound of "+name+" Bhav-Bhav ");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Non Veg ");
	}
	
	
}
