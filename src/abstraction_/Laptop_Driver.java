package abstraction_;

public class Laptop_Driver extends Laptop{
	int a;
	
	Laptop_Driver(String name,double price,int a){
		super(name,price);
		this.a=a;
	}
	public void demo() {
		System.out.println("Demo method ");
	}
	
	public static void main(String[] args) {
		
		Laptop_Driver ld=new Laptop_Driver("Lenovo",23000,43);
		
		System.out.println(ld.a);
		System.out.println(ld.name);
		System.out.println(ld.price);
		System.out.println(Laptop.colour);
		ld.play();
		watch();
		ld.demo();
	}
}