package abstraction_;

public class Demo extends Sample{
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	      Sample s1=new Demo();
	      s1.add(3,4);
	}
}