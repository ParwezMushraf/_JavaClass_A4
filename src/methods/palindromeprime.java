package methods;

import java.util.Scanner;

public class palindromeprime {

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
			boolean flag= true;
			for(int j=2; j<no ;j++) {
			if (no%j==0){
			 flag = false;
			 break;
			}
			}
			if (flag==true)
			{
				System.out.println(no);	
			}
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

		public static int prime(int no)
		{
			int prime=no;
			if (prime<1)
			{
				System.out.println(prime);
			}
			else
			{
				boolean flag=true;
				for(int i=2 ; i<prime ; i++)
				{
					int nob=i;
					if(prime%nob==0)
					{
						flag=false;
						break;
					}
				}
				if (flag==true)
				{
					System.out.println(prime);
				}
			}
			return prime;
		}
		
}

