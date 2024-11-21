package Non_Primitive_Type_casting;

public class C extends B{

	public static void main(String[] args) {
		B b1=new C();
		b1.main(null);
		System.out.println("-----C class-----");
		System.out.println(b1.col);
		b1.demo();
		System.out.println(b1.d1);
		b1.m1();
		

	}

}
