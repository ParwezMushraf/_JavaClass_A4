package methods;

interface abc{
	public static final int a=10;
	void main();
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

public class Practice1 implements abc{
	public static void main(String[] args) {
		int b=a+a;
		System.out.println(a);
		System.out.println(b);
		new Practice1().main();
		abc.main(null);
	}

	@Override
	public void main() {
		System.out.println("abstract method");
		
	}
}
