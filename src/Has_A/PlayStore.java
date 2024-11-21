package Has_A;

public class PlayStore {
	
	Snap Sid;
	public void installsnap(String name) {
		Sid=new Snap(name);
		System.out.println(name+" is your snap id");
	}
	Qtalk Qid;
	public void installqtalk(String name) {
		Qid=new Qtalk(name);
		System.out.println(name+" is your Qtalk id");
	}
}
