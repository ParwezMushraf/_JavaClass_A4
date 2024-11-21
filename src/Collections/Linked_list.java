package Collections;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		for(int i=1;i<=10;i++)
			l1.add(i);
		
		l1.add(null);
		l1.add(10);
		l1.add("Apple");
		l1.add(true);
		l1.add(args);
		l1.add(2,56);
		System.out.println(l1);
	}
}
