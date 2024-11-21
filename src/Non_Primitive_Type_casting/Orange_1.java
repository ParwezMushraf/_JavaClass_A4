package Non_Primitive_Type_casting;

public class Orange_1 extends Mango_1 {
	String col="Orange ";
	public void orange() {
		System.out.println("Orange colour is "+col);
	}
	public static void main(String[] args) {
		Mango_1 m1= new Orange_1();
		System.out.println("----object mango----");
		m1.mango();
		System.out.println("----object apple----");
		Apple_1 a1=(Apple_1) m1;
		a1.apple();
		System.out.println("----object orange----");
		System.out.println("    Access for All   ");
		Orange_1 o1=(Orange_1)a1;
		o1.apple();
		o1.mango();
		o1.orange();
	}

}
