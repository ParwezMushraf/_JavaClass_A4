package ARRAYS____;

import java.util.Scanner;

public class User_Whats_App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String UN=sc.next();
		int pwd=sc.nextInt();
		Whats_App wa=new Whats_App(UN,pwd);
		System.out.println();
	}
}
