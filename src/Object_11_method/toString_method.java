package Object_11_method;

public class toString_method {
	
	int red;
	
	public toString_method(int red) {
		this.red=red;
	}
	
	public String toString() {
		return red+"mm ";
	}
	
	public static void main(String[] args) {
		toString_method s1=new toString_method(90);
		System.out.println(s1);
		System.out.println(s1.toString());
	}
}
