package Constructor_Chaining;

public class Employee extends person {

	String name1;
	double sal;
	public Employee(String name1,double sal,String name,int age) {
		super(name, age);
		this.name1=name1;
		this.sal=sal;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Ahi ",5600,"Kartik",20);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.name1);
		System.out.println(e1.sal);
	}
}