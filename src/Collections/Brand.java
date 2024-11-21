package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Brand {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("RR");
		a1.add("Rolex");
		a1.add("USPOLO");
		a1.add("Google");
		a1.add("Amazon");
		ListIterator i=a1.listIterator();
		System.out.println(i);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}	
		System.out.println("------------");
		for(ListIterator j=i;j.hasNext();) {
			System.out.println(j.next());
		}
		System.out.println("------------");
		for(ListIterator j=i;j.hasPrevious();) {
			System.out.println(j.previous());
		}
	}
}