package Constructor;

public class grater {
	
	public static void main(String[] args) {
	int a=50;
	int b=20;
	int c=30;
	
	int res=a>b?a:b;
	
	String result=c>res?"C is grater than all":"b is grater than all";
	System.out.println(result);
	}

}
