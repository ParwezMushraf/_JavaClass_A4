package nonstatic;

import java.util.Scanner;
public class Calci {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number 1 to 4");
	int no=sc.nextInt();
	System.out.println("Enter X value");
	int x=sc.nextInt();
	System.out.println("Enter Y value");
	int y=sc.nextInt();
	
	switch(no) {
	case 1:{
		System.out.println("Add "+(x+y));
	}break;
	case 2:{
		System.out.println("Sub "+(x-y));
	}break;
	case 3:{
		System.out.println("Mult "+(x*y));
	}break;
	case 4:{
		System.out.println("Div "+(x%y));
	}break;
	}
}
}

