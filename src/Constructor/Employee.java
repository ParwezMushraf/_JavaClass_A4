package Constructor;

public class Employee {

	String name;
	double sal;

	public Employee(String name,double sal) {
		//System.out.println(name);
		//System.out.println(sal);
		this.name=name;
		this.sal=sal;
	}
	
	{
		System.out.println("~~~IT IS A NON STATIC BLOCK~~~");
	}
}
