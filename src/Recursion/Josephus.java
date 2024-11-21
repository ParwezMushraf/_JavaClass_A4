package Recursion;

import java.util.Scanner;

public class Josephus {

	static int jos(int n,int r){
		if(n==1) 
			return 0;
		return ((jos(n-1,r)+r)%n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("start nnumber");
		int st=sc.nextInt();
		System.out.println("end number");
		int end=sc.nextInt();
		System.out.println(jos(st,end)+1);
	}
}
