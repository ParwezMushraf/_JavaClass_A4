package Exception;

public class StackoverflowError {
	
	int age=20;
	{
		try {
			StackOverflowError s1=new StackOverflowError();
		}catch(StackOverflowError e1) {
				System.out.println("Exception han...!");
		}
	}
	
	public static void main(String[] args) {
		StackOverflowError s1=new StackOverflowError();
		System.out.println("Hello");
	}
}