package Object_11_method;

public class person {
	String name;
	int age;
	long c_no;
	
	person(String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}
	public String toString() {
		return name+" "+age+" "+c_no;
	}
	public boolean equals(Object obj) {
		//Object obj=p2
		person p1=(person) obj;
		return this.name==p1.name&& this.age==p1.age&& this.c_no==p1.c_no; 
	}
	public static void main(String[] args) {
		person p1=new person("Ahi",25,1234567899l);
		System.out.println(p1); 
		person p2=new person("Madhu",21,987654321l);
		System.out.println(p1); 
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		System.out.println(20==20);
	}
}
