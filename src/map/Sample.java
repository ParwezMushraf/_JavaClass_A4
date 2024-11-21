package map;

import java.util.HashMap;

public class Sample {
	 public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, "Akash");
		h1.put(2, "Manoj");
		h1.put(3, "Parwez");
		h1.put(4, "Ali");
		h1.put(5, "Ahi");
		h1.put(6, "Nikhil");
		System.out.println(h1);
		HashMap h2=new HashMap();
		h2.putAll(h1);
		System.out.println(h2);
	}
}
