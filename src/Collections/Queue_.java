package Collections;

import java.util.PriorityQueue;

public class Queue_ {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		for(int i=1;i<=10;i++) {
			p1.add(i);
		}
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1);
	}
}
