package Exception;

public class StringIndexoutofBound {

	public static void main(String[] args) {
		String name="parwez";
		String rev="";
		long st=System.nanoTime();
		for(int i=0;i<=name.length();i++) {
			try {
				rev=name.charAt(i)+rev;	
			}catch(StringIndexOutOfBoundsException s1) {
				System.out.println("Exception Han...");
			}
		}
		System.out.println(rev);
		long ed=System.nanoTime();	
		System.out.println(ed-st);
		System.out.println("----------------");
		long st1=System.nanoTime();
		    try {
				for(int i=0;i<=name.length();i++) {
				rev=name.charAt(i)+rev;	
				}
			}catch(StringIndexOutOfBoundsException s1) {
				System.out.println("Exception Han...");
			}
		System.out.println(rev);
		long ed1=System.nanoTime();	
		System.out.println(ed1-st1);
	}
}
