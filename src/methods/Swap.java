package methods;


public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
