package Exception;

public class Finally {

	public static void main(String[] args) {
		int a=12;
		int b=0;
		
		try {
		int res=a/b;
		System.out.println(res);
		}catch(ArithmeticException e1) {
			System.out.println("Exception han....!");
		}finally {
			System.out.println("Finally Block :) ");
		}
	}
}