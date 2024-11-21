package Constructor;

public class Student {
	String name;
	int id;
	String E_mail;
	
	public Student(String n, int I_d, String Mail_id){
		name=n;
		id=I_d;
	    E_mail=Mail_id;
	}
	
	public static void main(String[] args) {
	
		Student s1=new Student ("Parwez", 12345, "mushi@123");
		System.out.println(" NAME "+s1.name);
		System.out.println(" ID "+s1.id);
		System.out.println(" MAIL ID "+s1.E_mail);
	}

}
