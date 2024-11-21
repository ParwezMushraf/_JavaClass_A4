package Object_11_method;

public class HASHCODE {
	public static void main() {
		HASHCODE h1=new HASHCODE();
		System.out.println(h1);
		System.out.println(h1.hashCode());
		Sample s1=new Sample();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(h1.hashCode()==s1.hashCode());
	}
}