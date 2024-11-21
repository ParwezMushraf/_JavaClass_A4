package methods;

import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag == true)
		{
		System.out.println("ENTER NUMBER TO SEE TABLE :) ");
		int mul=prime();
		System.out.println("ENTER STARTING NUMBER TO SEE TABLE :) ");
		int st=sc.nextInt();
		System.out.println("ENTER ENDING NUMBER TO SEE TABLE :) ");
		int ed=sc.nextInt();
		for(int i=st ;i<=ed ; i++)
		{
			int no=mul*i;;
			System.out.println(mul+"*"+i+"="+no);
			
		}
		System.out.println("ENTER ZAKIYA IN CAPS TO REPEAT TABLE AGAIN ");
		int s=sc.nextInt();
		if (s==1)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
	}
		System.out.println("THANK YOU :) ");
    }
	public static int prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER TO CHECK ITS PRIME OR NOT ");
		int no=sc.nextInt();
		if(no<=1)
		{
			System.out.println("Its not a prime number");
		}
		else 
		{
			boolean flag=true;
			for(int i=2 ; i<no ; i++)
			{
				int n=i;
				if(no%n==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("Its a prime no and your no is "+no);
			}
		}
		return no;
	}
	
}
		