package ARRAYS____;

public class aryyy_6_Class {
	
	public static void sum(int s1[]) {
		int sum=0;
		for(int ch:s1) {
			sum=ch+sum  ;
		}
		System.out.println("Sum of numbers :"+sum);
		
	}
	
	public static void main(String[] args) {
		int no[]= {10,20,30};
		sum(no);
	}
}
