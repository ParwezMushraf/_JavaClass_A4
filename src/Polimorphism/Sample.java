package Polimorphism;

public class Sample {
	
	public static void demo() {
		System.out.println("Demo Method :) ");
	}
	public static void demo(int a) {
		System.out.println("Demo Method :) "+a);
	}
	public static void demo(double a) {
		System.out.println("Demo Method :) "+a);
	}
	public static void demo(long a ) {
		System.out.println("Demo Method :) "+a);
	}
	public static void demo(char ch) {
		System.out.println("Demo Method :) "+ch);
	}

	public static void main(String[] args) {
		demo('a');

	}

}
