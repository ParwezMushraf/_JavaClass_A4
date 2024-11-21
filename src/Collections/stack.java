package Collections;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("Butter Chicken");
		s1.add("Dum Biryani");
		s1.add("Mutton Biryani");                                
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println("---------");
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println("---------");
		s1.push("Facebook");
		s1.push("Facebook");
		System.out.println(s1);	
	}
}