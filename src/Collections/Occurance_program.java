package Collections;

import java.util.LinkedHashSet;

public class Occurance_program {
	public static void main(String[] args) {
		String s1="Java Mava class A4";
		LinkedHashSet<Character> l1=new LinkedHashSet();
		
		for(int i=0;i<=s1.length()-1;i++) {
			l1.add(s1.charAt(i));
		}
		System.out.println(l1);
		for(Object ch:l1) {
			char ch1=(char)ch;
			int count=0;
			for(int i=0;i<=s1.length()-1;i++) {
				if(ch1==s1.charAt(i))
				count++;
			}
			System.out.println(ch1+" -> "+count);
		}
		
	}
}
