package Encapsulation;

import java.util.Scanner;

public class Emp {
	private String name;
	private int id;
	private double salary;
	
	private Emp(String name,int id,double salary) {
		if(salary>=1000) {
			this.name=name;
			this.id=id;
			this.salary=salary;
		}else {
			//em=new Emp();
		}
	}
	
	public static void setSalary(String name,int id,double salary) {
		Emp e1=new Emp(name,id,salary);
		
	}
	
//	Emp em;
//	
//	public Emp() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Name");
//		String name=sc.next();
//		System.out.println("Enter Id");
//		int id=sc.nextInt();
//		System.out.println("Enter Salary");
//		double salary=sc.nextDouble();
//		em=new Emp(name,id,salary);
//		
//	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalary() {
		return salary;
	}
	
//	public static void main(String[] args) {
//		Emp e2=new Emp();
//		System.out.println(e2.getName());
//	}
}