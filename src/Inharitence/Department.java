package Inharitence;

public class Department extends College{
	
	String name="Commerce";
	int clas=3;
	int student=45;
	
	
	public static void main(String[] args) {
		
		Department d1=new Department();
		University u1=new University();
		
		System.out.println(u1.name);
		System.out.println(d1.clas);
		System.out.println(d1.student);
		
		System.out.println(d1.name);
		System.out.println(d1.HOD);
		Batch();
		d1.External_exam();
		
		
	}
}
