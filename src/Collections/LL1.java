package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LL1 {
	public static void main(String[] args) {
		String s1="Good Morning to everyone";
		LinkedHashSet l1=new LinkedHashSet();
		for(int i=0;i<=s1.length()-1;i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
			if(s1.charAt(i)==s1.charAt(j)) {
				count++;
				//l1.add(s1.charAt(i)+" = "+count);
			}
			}
			for(int j=0;j<=i;j++) {
				if(s1.charAt(i)==s1.charAt(j) && count>=1) {
					l1.add(s1.charAt(i)+" = "+count);
				}
				}
		}
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}