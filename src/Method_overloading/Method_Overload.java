package Method_overloading;

public class Method_Overload {
	public static void add() {
		System.out.println("No Argument method :) ");
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
	
	public void add(int a,int b) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		add(10);

	}

}
