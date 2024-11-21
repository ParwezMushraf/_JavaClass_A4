package ARRAYS____;

import java.util.Scanner;

public class aryyy_3nd_Class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a SIZE of ARRAY");
		int size=sc.nextInt();
		double d[]=new double[size];
		
		System.out.println(d.length);
		
		for(int i=0;i<=d.length-1;i++) {
			System.out.println("Enter A CHARACTER in INDEX "+i);
			d[i]=sc.nextDouble();
		}
		
		for(int i=0;i<=d.length-1;i++) {
			System.out.println(d[i]);
		}
	}
}
