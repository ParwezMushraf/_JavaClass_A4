package Constructor;

public class person {

	String name;
	int age;
	long c_no;
	
	
	public person(String name) {
		this.name=name;
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public person(String name,int age,long c_no) {
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}
	public static void main(String[] args) {
		person p1=new person("Ahi ");
		System.out.println(p1.name);
		
		person p2=new person("Ahi ",24);
		System.out.println(p2.name+" ~ "+p2.age);
		
		person p3=new person("Ahi ",24,34567890);
		System.out.println(p3.name+" ~ "+p3.age+" ~ "+p3.c_no);
		

	}

}
