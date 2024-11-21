package Encapsulation;

public class Employee_driver {
	

	public static void main(String[] args) {
	
		
		Employee em=new Employee("Parwez ",73544,50000);
		
		System.out.println(em.getname());
		System.out.println(em.getid());
		System.out.println(em.getsalary());

		em.setsalary("Akash",83765,400);
		
		System.out.println(em.getname());
		System.out.println(em.getid());
		System.out.println(em.getsalary());
	
	}
}
