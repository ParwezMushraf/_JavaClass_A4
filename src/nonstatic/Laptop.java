package nonstatic;
 
public class Laptop {
	
	String name="HP";
	double price=35000;
	
	public void play(){
		System.out.println("playing game");
		System.out.println(name);
	}
	
	public void watch() {
		System.out.println(name);
		System.out.println(price);
		System.out.println("watching movie :) ");
	}

	public static void main(String[] args) {
		Laptop l1= new Laptop();
        System.out.println(l1.name);
        System.out.println(l1.price);
        l1.play();
        l1.watch();
	}

}
