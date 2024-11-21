package S_Builder_S_Buffer;

public class BB {
	public static void main(String[] args) {
		System.out.println("String  ");
		long st=System.nanoTime();
		String s1="syncronized";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		long ed=System.nanoTime();
		System.out.println(ed-st);
		System.out.println("~~~~~~~~~~~~~~~");
		
		System.out.println("String Buffer  ");
		long st1=System.nanoTime();
		StringBuffer sb=new StringBuffer("syncronized");
		StringBuffer sb1=new StringBuffer("");
		for(int i=sb.length()-1;i>=0;i--) {
			sb1=sb1.append(sb);
		}
		System.out.println(sb);
		long ed1=System.nanoTime();
		System.out.println(ed1-st1);
		System.out.println("~~~~~~~~~~~~~~~");
		
		System.out.println("String Builder ");
		long st2=System.nanoTime();
		StringBuilder SB=new StringBuilder("syncronized");
		StringBuilder SB1=new StringBuilder("");
		for(int i=sb.length()-1;i>=0;i--) {
			SB1=SB1.append(SB);
		}
		System.out.println(SB);
		long ed2=System.nanoTime();
		System.out.println(ed2-st2);
	}
}
