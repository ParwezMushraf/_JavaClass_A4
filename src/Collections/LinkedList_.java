package Collections;

import java.util.LinkedList;

public class LinkedList_ {
	public static void main(String[] args) {
		String s1="Java Mava 12123";
		int Count[]=new int[256];
		for(int i=0;i<=s1.length()-1;i++) {
			Count[s1.charAt(i)]++;
		}
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++) {
				if(ch==s1.charAt(j)) {
					find++;
				}
			}
			if(find==1)
				System.out.println(ch+" : "+Count[s1.charAt(i)]);
		}
	}
}
