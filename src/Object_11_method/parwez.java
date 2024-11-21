package Object_11_method;

public class parwez {
	String name;
	int id;
	long c_no;
	public parwez(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;
	}
	public String toString() {
		System.out.println("E name: "+name);
		System.out.println("E id: "+id);
		System.out.println("E c_no: "+c_no);
		return "";
	}
	public int hashCode() {
		return (int)c_no;
	}
	public static void main(String[] args) {
		long n=5678909872l;
		parwez p1=new parwez("PARWEZ",12,n);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode()==n);
	}
}