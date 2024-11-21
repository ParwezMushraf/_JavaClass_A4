package Inharitence;

public class Cat extends Animal{
	
	public void meowFrequency(){
		System.out.println("Yes It is a meow frequency  :)  ");
	}
	
	public static void main(String[] args) {
		Cat c1=new Cat();
		System.out.println(c1.CanSwimm);
		c1.WarmBlood();
		c1.meowFrequency();
		
	}
}
