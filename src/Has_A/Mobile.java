package Has_A;

public class Mobile {
	
	String name,colour;
	
	Mobile(String name,String colour){
		this.name=name;
		this.colour=colour;
	}
	PlayStore pid;
	public void InstallPlayStore() {
		pid=new PlayStore();
		System.out.println("play store is installed sucessfully ");
	}
	
}
