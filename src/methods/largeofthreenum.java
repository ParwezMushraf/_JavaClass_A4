package methods;

import java.util.Scanner;

public class largeofthreenum {
	
	
	static Scanner sc=new Scanner(System.in); 
	
	static int a = sc.nextInt();
	
	static int b = sc.nextInt();
	
	int c = sc.nextInt();
	

	public static void main(String[] args) {
		
		largeofthreenum s1= new largeofthreenum();
		
		if(a>b && a>s1.c)
		{
			System.out.println("a is grater than all");
		}
		else if(b>a && b>s1.c)
		{
			System.out.println("b is grater than all");
		}
		else
		{
			System.out.println("c is grater than all" );
			
		}
	}

}
