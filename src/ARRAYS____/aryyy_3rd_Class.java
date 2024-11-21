package ARRAYS____;

import java.util.Scanner;

public class aryyy_3rd_Class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a SIZE of ARRAY");
		int size=sc.nextInt();
		long lo[]=new long[size];
		
		System.out.println(lo.length);
		
		for(int i=0;i<=lo.length-1;i++) {
			System.out.println("Enter A CHARACTER in INDEX "+i);
			lo[i]=sc.nextLong();
		}
		
		for(int i=0;i<=lo.length-1;i++) {
			System.out.println(lo[i]);
		}
	}
}
