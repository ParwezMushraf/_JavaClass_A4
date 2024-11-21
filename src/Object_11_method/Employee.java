package Object_11_method;

public class Employee {

	String name;
	double sal;
	int id;
	
	Employee(String name,double sal,int id){
		this.name=name;
		this.sal=sal;
		this.id=id;
	}
	
	public String toString() {
		//super.toString();
		return name+" ! "+sal+" ! "+id;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("Ahi",25000,150);
		Employee e2=new Employee("parwez",26000,151);
		Employee e3=new Employee("akash",27000,152);
		Employee e4=new Employee("nikhil",28000,153);
		Employee e5=new Employee("kanth",29000,154);
		Employee e6=new Employee("mani",35000,155);
		Employee e7=new Employee("bhramam",35000,155);
		Employee e8=new Employee("manoj",45000,156);
		
		Employee emp[]= {e1,e2,e3,e4,e5,e6,e7,e8};
		for(Employee i:emp) {
			System.out.println(i);
		}
	}
}
