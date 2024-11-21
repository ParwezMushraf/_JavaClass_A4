package Method_overloading;

public class Telegram_with_returntype {

	public static String send() {
		String st="NO_ Arguments";
		return st;
	}
	public static boolean send(int a,int b) {
		boolean f=false;
		int rem=a+b;
		if(rem%2==0) {
		 f=true;
		}
		return f;
	}
	
	public static long send(long no) {
		return no;
	}
	
	public static String send(String s1) {
		return s1;
	}
	public static String send(int a, String s1,String s2) {
		String add=a+s1+s2;
		return add;
	}
	
	public static String main() {
		String st="NO_ Arguments";
		return st;
	}
	public static boolean main(int a,int b) {
		boolean f=false;
		int rem=a+b;
		if(rem%2==0) {
		 f=true;
		}
		return f;
	}
	
	public static long main(long no) {
		return no;
	}
	
	public static String main(String s1) {
		return s1;
	}
	public static String main(int a, String s1,String s2) {
		String add=a+s1+s2;
		return add;
	}
	
	static {
	 System.out.println(main());
	 System.out.println(main(123456723l));
	 System.out.println(main("Hello __--__ HOW ARE YOU :)"));
	 System.out.println(main(1,"st link is ~~ "," www.teligram.com "));
	 System.out.println("Your Given Number is "+main(10,14));
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
	 System.out.println(send());
	 System.out.println(send(123456723l));
	 System.out.println(send("Hello __--__ HOW ARE YOU :)"));
	 System.out.println(send(1,"st link is ~~ "," www.teligram.com "));
	 System.out.println("Your Given Number is "+send(10,14));
	}

}
