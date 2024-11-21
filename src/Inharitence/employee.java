package Inharitence;

public class employee extends Person {

	int id=345;
	String dept="Commerce";
	double salary=5000;
	
	public static void main(String[] args) {
		employee emp=new employee();
		
		
		System.out.println(emp.getname());
		System.out.println(emp.age);
		System.out.println(emp.id);
		System.out.println(emp.dept);
		System.out.println(emp.salary);
		
		
	}
}
