package abstraction_;

public class Twitter extends Application {
	
	public void SignUp(String name) {
		System.out.println("Your name is accepted : "+name);
	}
	
	public void Login(long U_No) {
		System.out.println("Your No is accepted : "+U_No);
	}
	
	public static void main(String[] args) {
		Twitter t1=new Twitter();
		t1.SignUp("Parwez");
		t1.Login(456789);
	}
	
}
