package Exception;
import java.util.Scanner;

public class NotElegibleforVoter extends Exception{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Your elegible for Voting :)");
			System.out.println("Thank You:");
		}else {
			try {
				throw new NotElegibleforVoter();
			}catch(NotElegibleforVoter e1) {
				System.out.println("Not Elegible :)");
				e1.printStackTrace();
				System.out.println("Thank You:");
				System.out.println("Better Luck Next Time ");
			}
		}
		System.out.println("TaTa Byee Byee ");
	}
}