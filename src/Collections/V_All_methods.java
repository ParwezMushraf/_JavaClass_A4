package Collections;
import java.util.Vector;

import abstraction_.A;

public class V_All_methods {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("C");
		v1.add("C++");
		v1.add("Java");
		v1.add("Python");
		Vector v2=new Vector();
		v2.add("SQL");
		v2.add("API");
		v2.add("Fire Flink");
		v1.add(v2);
		System.out.println(v1);
		System.out.println(v1.contains(v2));
		v1.remove(v2);
		System.out.println(v1);
		System.out.println("----------------------------------------------");
		v1.addAll(v2);
		System.out.println(v1);
		System.out.println(v1.containsAll(v2));
		v1.removeAll(v2);
		System.out.println(v1);
		System.out.println("----------------------------------------------");
		v2.clear();
		System.out.println(v2);
		System.out.println("----------------------------------------------");
		for(int i=0;i<=v1.size()-1;i++) {
			System.out.println(v1.get(i));
		}
	}
}
