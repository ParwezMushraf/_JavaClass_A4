package Method_overloading;

public class whatsapp_no_returntype {

	public void add() {
		System.out.println("NO_Arguments Method");
	}
	
	public void add(long no) {
		System.out.println(no);
	}
	
	public void add(String sms) {
		System.out.println(sms);
	}
	
	public void add(double money) {
		System.out.println(money);
	}
	
	public static void main(String[] args) {
		whatsapp_no_returntype w1=new whatsapp_no_returntype();
		
		w1.add();
		w1.add(234567645l);
		w1.add("Hii Bro ");
		w1.add(150.0);

	}

}
