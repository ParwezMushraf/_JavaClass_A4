package Collections;

import java.util.ArrayList;
public class Merge_array {
	public static void main(String[] args) {
		int a[]= {12,13,14,152,43};
		int a1[]= {12,13,15,52,43};
		ArrayList<Integer> a2=new ArrayList();
		for(int i=0,j=0;i<=a.length-1 && j<=a1.length-1;i++,j++) {
			a2.add(a[i]);
			a2.add(a1[j]);
		}
		System.out.println(a2);
	}
}
