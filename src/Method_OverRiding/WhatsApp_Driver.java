package Method_OverRiding;

public class WhatsApp_Driver extends WhatsApp {
	
	public void status() {
		System.out.println("BYEE - What's_App");
	}

	public static void main(String[] args) {
		WhatsApp_Driver w1=new WhatsApp_Driver();
		w1.status();

	}

}
