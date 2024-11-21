package Exception;

public class try_with_multi_catch extends Object {
	
	String s1="Java";
	public static void main(String[] args) {
		Object obj=new try_with_multi_catch();
		
		try {
			try_with_multi_catch s1=(try_with_multi_catch)new Object();
		}catch(ClassCastException e1) {
			System.out.println("ClassCastException han...!");
			try_with_multi_catch s1=(try_with_multi_catch)null;
			System.out.println();
		}catch(NullPointerException e1) {
			System.out.println("NullPointerException han...!");
		}
	}
}
