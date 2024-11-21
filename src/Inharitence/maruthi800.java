package Inharitence;

public class maruthi800 extends car {
	
	String car_name="Maruthi ";
	double old_price=150000;
	double new_price=car.price;
	
	public void model() {
		System.out.println("M1-657_2A MODEAL ");
	}
	
	public void seaters() {
		System.out.println("4 Seater Vehical ");
	}

	public static void main(String[] args) {
		maruthi800 m1=new maruthi800();
		
		System.out.println(m1.name);
		System.out.println(m1.name1);
		m1.seater2();
		m1.seater4();
		System.out.println(m1.price);
		System.out.println(m1.colour);
		m1.speed();
		m1.relax();
		System.out.println("Car Name  ~>"+m1.car_name);
		System.out.println("Old Price ~>"+m1.old_price);
		System.out.println("New Price ~>"+m1.new_price);
		m1.model();
		m1.seaters();
		
		
	}
}
