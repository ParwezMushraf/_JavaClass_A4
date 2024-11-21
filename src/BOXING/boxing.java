package BOXING;

public class boxing {
	public static void main(String[] args) {
		short s=2;
		Short s1=s;
		Short s2=new Short(s);
		Short s3=Short.valueOf(s);
		System.out.println(s1+":"+s2+":"+s3);
		long l=245678765456L;
		Long l1=l;
		Long l2=new Long(l);
		Long l3=Long.valueOf(l);
		System.out.println(l1+":"+l2+":"+l3);
		float f=123.123F;
		Float f1=f;
		Float f2=new Float(f);
		Float f3=Float.valueOf(f);
		System.out.println(f1+":"+f2+":"+f3);
		double d=321.321;
		Double d1=d;
		Double d2=new Double(d);
		Double d3=Double.valueOf(d);
		System.out.println(d1+":"+d2+":"+d3);
		char c='A';
		Character c1=c;
		Character c2=new Character(c);
		Character c3=Character.valueOf(c);
		System.out.println(c1+":"+c2+":"+c3);
		boolean b=true;
		Boolean b1=b;
		Boolean b2=new Boolean(b);
		Boolean b3=Boolean.valueOf(b);
		System.out.println(b1+":"+b2+":"+b3);
		
	}
}
