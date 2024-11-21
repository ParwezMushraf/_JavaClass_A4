package Method_OverRiding;

public class youtube_drive1 extends Youtube_driver {

	public void watch() {
		super.watch();
		System.out.println("Watch Shots along with Movies and Videos :)");
	}
	
	public static void main(String[] args) {
		youtube_drive1 y1=new youtube_drive1();
		y1.watch();
		
	}
}
