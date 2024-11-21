package Encapsulation;

import java.util.Scanner;

public class Employee {

	private String name;
	private int id;
	private double salary;
	
	public Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	
	public void setsalary(String name,int id,double salary) {
		Scanner sc=new Scanner(System.in);
		if(salary>=5000) {
			this.name=name;
			this.id=id;
			this.salary=salary;
		}else {
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter name ,id & salary above 5000");
			setsalary1(sc.next(),sc.nextInt(),sc.nextDouble());
		}
	}
	
	public  void setsalary1(String name,int id,double salary) {
		Scanner sc=new Scanner(System.in);
		if(salary>=50000) {
			this.name=name;
			this.id=id;
			this.salary=salary;
		}else {
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter name , id & salary above 5000");
			setsalary(sc.next(),sc.nextInt(),sc.nextDouble());
		}
	}
	
	public String getname() {
		return name;
	}
	
	public int getid() {
		return id;
	}
	
	public double getsalary() {
		return salary;
	}
}
