package BOXING;

public class Parseing {
	public static void main(String[] args) {
		String s1="23";
		Byte b1=Byte.parseByte(s1);
		System.out.println(b1);
		Short s=Short.parseShort(s1);
		System.out.println(s);
		Integer i1=Integer.parseInt(s1);
		System.out.println(i1);
		Long l1=Long.parseLong(s1);
		System.out.println(l1);
		Float f1=Float.parseFloat(s1);
		System.out.println(f1);
		Double d1=Double.parseDouble(s1);
		System.out.println(d1);
		Character ch=s1.charAt(0);
		System.out.println(ch);
		String name="true";
		Boolean b=Boolean.parseBoolean(name);
		System.out.println(b);	
	}
}