package ARRAYS____;

import java.util.Scanner;

public class aryyy_2nd_Class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a SIZE of ARRAY");
		int size=sc.nextInt();
		char ch[]=new char[size];
		
		System.out.println(ch.length);
		
		for(int i=0;i<=ch.length-1;i++) {
			System.out.println("Enter A CHARACTER in INDEX "+i);
			ch[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<=ch.length-1;i++) {
			System.out.print(ch[i]);
		}
	}
}