package Exception;

public class try_catch {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("___try starts___");
			int res=a/b;
			System.out.println(res);
			System.out.println("____try ends____");
		}catch(ArithmeticException e1) {
			System.out.println("Execution handleing.....");
		}
	}
}
