package abstraction_;

public abstract class Laptop {
	
	public abstract void demo();
	
	String name;								     // Non static variable
	double price;
	static String colour="Black";  				     // static variable 
	
	Laptop(String name,double price){				 // Constructor
		this.name=name;
		this.price=price;
	}
	public void play() {							// Non static method
		System.out.println("Playing Games :)");
	}
	public static void watch() {		
		System.out.println("Watching Movies:) ");// static method
  	}
	{												// Non static block
		System.out.println("Non Static Method ");
	}
	static {										// static block
		System.out.println("Static Method ");
	}
	
}