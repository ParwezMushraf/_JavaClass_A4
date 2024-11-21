package methods;
import java.util.Scanner;

public class palindrome
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter start number");
	int st=sc.nextInt();
	System.out.println("Enter end number");
	int ed=sc.nextInt();
	
	
	for(int i=st ; i<=ed ;i++)
	{
		int no=i;
	if(no==reverse(no))
	{
		System.out.println(no);
	}
	}
	
}

	public static int reverse(int no)
	{
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no/=10;
		}
		
		return rev;
	}

}