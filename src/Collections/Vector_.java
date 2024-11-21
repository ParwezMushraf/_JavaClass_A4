package Collections;

import java.util.Vector;

public class Vector_ {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("RCB");
		v1.add("CSK");
		v1.add("MI");
		v1.add("SRH");
		v1.add("RCB");
		v1.add(null);
		v1.add(2,"DD");
		System.out.println(v1);
	}
}
