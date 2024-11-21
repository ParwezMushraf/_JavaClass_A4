package Constructor_Chaining;

public class TRENDS extends ZUDIO {
	String name2;
	double price2;
	public TRENDS(String name2,double price2,String name1,double price1,String name,double price) {
		super(name1,price1,name,price);
		this.name2=name2;
		this.price2=price2;
	}
	public static void main(String[] args) {
		TRENDS t1=new TRENDS("Trends ",2000,"Zudio ",3000,"Biba ",5000);
		System.out.println(t1.name);
		System.out.println(t1.price);
		System.out.println(t1.name1);
		System.out.println(t1.price1);
		System.out.println(t1.name2);
		System.out.println(t1.price2);
	}

}
