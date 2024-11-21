package Inharitence_Multi_Hirarical;

public class Driver_1 {

	public static void main(String[] args) {
		Cat_New n1=new Cat_New();
		n1.sound("Cat");
		n1.eat();
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		Dog_New d1=new Dog_New();
		d1.sound("Dog");
		d1.eat();
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		Snake_New s1=new Snake_New();
		s1.sound("Snake");
		s1.eat();

	}

}
