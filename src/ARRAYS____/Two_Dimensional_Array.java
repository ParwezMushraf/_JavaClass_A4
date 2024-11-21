package ARRAYS____;
import java.util.Scanner;
public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double no=10;
		
		double a[][]=new double[3][3];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				a[i][j]=no;
				no=no+10;
			}
		}
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
