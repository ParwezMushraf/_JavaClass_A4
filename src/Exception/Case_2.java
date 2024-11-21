package Exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Case_2 {
	
	public static void demo(int i) {
		File f1=new File("C:\\Users\\hp\\OneDrive\\Desktop\\File\\Java"+i+".apk");
		try {
			boolean flag=f1.createNewFile();
			//boolean flag=f1.mkdir();
			System.out.println(flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many files you need to create ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
		demo(i);
		Thread.sleep(1000);
		}
	}
}
