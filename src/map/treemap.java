package map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class treemap{
	public static void main(String[] args) {
		TreeMap<String,Integer> t1=new TreeMap<String,Integer>();
		t1.put("Java",96);
		t1.put("Sql",30);
		t1.put("Manual",60);
		t1.put("Api",30);
		t1.put("Atm",50);
		System.out.println(t1);
		System.out.println(t1.remove("Sql"));
		System.out.println(t1);
		System.out.println(t1.remove("Atm",50));
		System.out.println(t1);
//		Set s1=t1.entrySet();
//		Iterator i=s1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
	}
}