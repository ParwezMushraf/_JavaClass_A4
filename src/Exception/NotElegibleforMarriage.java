package Exception;
import java.util.Scanner;

public class NotElegibleforMarriage extends RuntimeException {
	
	public String getMessage() {
		return "Not Elegible for marriage";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		if(age>=21)
			System.out.println("Best of Luck : ");
		else
			try {
			throw new NotElegibleforMarriage();
			}catch(NotElegibleforMarriage e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();			
			}
	}
}