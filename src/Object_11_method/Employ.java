package Object_11_method;

public class Employ {
	String name;
	int id;
	long c_no;
	public Employ(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;
	}
	public String toString(){
		System.out.println("Employ Name:"+name);
		System.out.println("Employ Id:"+id);
		System.out.println("Employ C_no:"+c_no);
		return "";
	}
	public int hashCode(){
		return id;
	}
	public static void main(String[] args) {
		Employ e1=new Employ("Ahi",123,234567l);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		System.out.println("~~~~~~~~~~~~~~~");
		Employ e2=new Employ("Manoj",321,345677l);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());
	}
}