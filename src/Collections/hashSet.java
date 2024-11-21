package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashSet {
	public static void main(String[] args) {
		LinkedHashSet h1=new LinkedHashSet();
		h1.add("Parwez");
		h1.add("Akash");
		h1.add("Manoj");
		h1.add("Sree Kanth");
		h1.add("Ali");
		h1.add("Parwez");
		h1.add("Bhramam");
		h1.add("Akash");
		h1.add("Manoj");
		h1.add("Nikhil");
		System.out.println(h1);	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String s1="Pushpa Raj";
		LinkedHashSet h2=new LinkedHashSet();
		for(int i=0;i<=s1.length()-1;i++) {
			h2.add(s1.charAt(i));
		}
		System.out.println(h2);
	}
}