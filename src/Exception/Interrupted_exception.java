package Exception;

public class Interrupted_exception {
	public static void main(String[] args) {//throws InterruptedException{
		for(int i=1;i<=20;i++) {
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" "+i);
		}
	}
}
