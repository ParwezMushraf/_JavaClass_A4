package Has_A;

public class TestMobiles {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Oppo ","Black ");
		System.out.println(m1.name);
		System.out.println(m1.colour);
		m1.InstallPlayStore();
		m1.pid.installsnap("Parwez ");
		m1.pid.installqtalk("Kanth ");
	
	}
}
