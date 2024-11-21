package Collections;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ThumsUp");
		a1.add("Sprite");
		a1.add("Mazza");
		a1.add("Fanta");
		a1.add("Fizz");
		System.out.println(a1);
		System.out.println("--------------------------------");
		ArrayList a2=new ArrayList();
		a2.add("Apple");
		a2.add("Banana");
		a2.add("Mango");
		a2.add("Grapes");
		a2.add("Orange");
		System.out.println(a2);
		System.out.println("--------------------------------");
		
		a1.add(a2);
		System.out.println(a1);
		System.out.println(a1.contains(a2));
		System.out.println("--------------------------------");
		a1.remove(a2);
		System.out.println(a1);
		System.out.println("--------------------------------");
		
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.containsAll(a2));
		System.out.println("--------------------------------");
		a1.removeAll(a2);
		System.out.println(a1);
		System.out.println("--------------------------------");
		
	}
}