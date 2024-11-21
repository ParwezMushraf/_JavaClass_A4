package Constructor_Chaining;

public class Twitter {
	String name;
	int size;
	
	public Twitter() {
		System.out.println("No Argument Constructor  ");
	}
	
	public Twitter(String name) {
		this();
		System.out.println("Argument list ");
		this.name=name;
	}
	
	public Twitter(int size) {
		this("Twitter ");
		System.out.println("Argument list 1 ");
		this.size=size;
	}
	
	public static void main(String[] args) {
		Twitter t1=new Twitter(12);
		System.out.println(t1.name);
		System.out.println(t1.size);
	}
}