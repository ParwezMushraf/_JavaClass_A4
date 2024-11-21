package Recursion;

public class print_digits {

	static void print(int n) {
		if(n<=0) {
			return;
		}
		System.out.println(n%10);
		print(n/10);
	}
	public static void main(String[] args) {
		print(2345);
	}
}
