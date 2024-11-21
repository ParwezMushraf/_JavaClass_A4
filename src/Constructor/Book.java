package Constructor;

public class Book {
	String name;
	int pages;
	double price;
	
	Book(String name,int pages,double price){
		this.name=name;
		this.pages=pages;
		this.price=price;
	}
	public static void main(String[] args) {
		Book b1=new Book("JAVA",1450,200);
		System.out.println(b1.name);
		System.out.println(b1.pages);
		System.out.println(b1.price);
		System.out.println("~~~~~~~~~~~~~~");
		Book b2=new Book("MANUAL",145,250);
		System.out.println(b2.name);
		System.out.println(b2.pages);
		System.out.println(b2.price);
		System.out.println("~~~~~~~~~~~~~~");
		Book b3=new Book("API",120,100);
		System.out.println(b3.name);
		System.out.println(b3.pages);
		System.out.println(b3.price);
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println(b1.name+"  |"+b2.name+" |"+b3.name);
		System.out.println(b1.pages+"  |"+b2.pages+"    |"+b3.pages);
		System.out.println(b1.price+" |"+b2.price+"  |"+b3.price);
		

	}

}
