package Non_Primitive_Type_casting;

public class B extends A{
	double d1=123.123;
	
	public void m1() {
		System.out.println("B method called ");
	}
	
	public static void main(String []args) {
		A a1=new B();
		System.out.println(a1.col);
		a1.demo();
		System.out.println("~~~~B class~~~~");
		B b1=(B)a1;
		System.out.println(b1.col);
		b1.demo();
		System.out.println(b1.d1);
		b1.m1();
	}
}
