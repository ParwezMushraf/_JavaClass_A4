package Constructor_Chaining;

public class Instagram {
	String name;
	int size;
	public Instagram() {
		System.out.println("NO Argument Constructor ");
	}
	public Instagram(String name) {
		this();
		System.out.println("Argument Constructor ");
		this.name=name;
	}
	public Instagram(int size) {
		this("Instagram");
		System.out.println("Argument Constructor 1 ");
		this.size=size;
	}
	public static void main(String[] args) {
		Instagram i1=new Instagram(23);
		System.out.println(i1.name);
		System.out.println(i1.size);

	}
}