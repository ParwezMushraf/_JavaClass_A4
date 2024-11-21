package Object_11_method;

public class Student {
	
	String name;
	int id;
	String Email;
	
	public Student(String string,int id,String Email) {
		this.name=string;
		this.id=id;
		this.Email=Email;
	}
	
	public String toString() {
		return name+" "+id+" "+Email;
	}
	public static void main(String[] args) {
		Student s1=new Student("Parwez", 244, "Parwez@123");
		System.out.println(s1);
	}
}
