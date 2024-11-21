package Exception;

public class null_pointer_exception {
	
	String name;
	double price;
	null_pointer_exception(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public static void main(String[] args) {
		null_pointer_exception n=new null_pointer_exception("Java",999);
		// null_pointer_exception n=null; 
		System.out.println(n.name);
		System.out.println(n.price);
		
	}
}
