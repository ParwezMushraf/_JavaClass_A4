package Exception;

import java.util.Arrays;

public class Array_Exception {
	public static void main(String[] args) {
		int a[]= {12,12,23,43,23,43,12,34,37};

		try {
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception Hand....!");
			e1.printStackTrace();
		}
	}
}
