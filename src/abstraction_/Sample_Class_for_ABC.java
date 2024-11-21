package abstraction_;

public class Sample_Class_for_ABC implements C{

	public void m1() {
		System.out.println("m1 method ");
	}

	public void m2() {
		System.out.println("m2 method ");
	}
	
	public static void main(String[] args) {
		Sample_Class_for_ABC s1=new Sample_Class_for_ABC();
		s1.m1();
		s1.m2();
		System.out.println(s1.a);
		System.out.println(s1.b);
	}
}