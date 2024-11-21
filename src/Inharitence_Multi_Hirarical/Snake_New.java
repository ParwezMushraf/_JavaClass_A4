package Inharitence_Multi_Hirarical;

public class Snake_New extends Animal_New {

	public void sound(String name) {
		super.sound(name);
		System.out.println("Sound of "+name+" SHEEE ");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Frog ");
	}
}
