package Collections;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.capacity());
		for(char ch='A';ch<='J';ch++) {
			v1.add(ch);
		}
		System.out.println(v1);
	}
}
