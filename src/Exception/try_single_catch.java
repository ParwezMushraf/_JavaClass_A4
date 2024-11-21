package Exception;

public class try_single_catch extends Object {
	String s1="java";
	public static void main(String[] args) {
		Object obj=new try_single_catch();
		try {
			try_single_catch oj=(try_single_catch) new Object();
		}catch(RuntimeException e1) {
			System.out.println("Exception hand.....!");
		}
	}
}