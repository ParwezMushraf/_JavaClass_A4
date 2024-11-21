package Collections;

import java.util.ArrayList;

public class program1 {
	public static void main(String[] args) {
		int a[]= {13,12,14,15,16};
		int a1[]= {13,11,10,15,12,18,19};
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i:a)
			l1.add(i);
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i:a1)
			l2.add(i);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println(l1);
		
		for(int i=0;i<=l1.size()-1;i++) {
			System.out.println(l1.get(i));
		}
	}
}
