package String_s;

public class String_s {
	int no;
	public int hashCode() {
		return no;
	}
	public String_s(int no) {
		this.no=no;
	}
	
	public static void main(String[] args) {
		String s1="Java";
		String s2=s1;
		System.out.println(s1==s2);
		System.out.println(s2.equals(s1));
		String s3="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s3);
	}
}
