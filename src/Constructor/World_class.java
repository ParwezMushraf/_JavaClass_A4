package Constructor;	

public class World_class {

	public static void main(String[] args) {
		World w1=new World("India");
		System.out.println(w1.name);
		World w2=new World("India",29);
		System.out.println(w2.name+" "+w2.states);
		World w3=new World("India",29," Rs ");
		System.out.println(w3.name+" "+w3.states+" "+w3.cur_name);
		World w4=new World("India",29," Rs ",3730);
		System.out.println(w4.name+" "+w4.states+" "+w4.cur_name+" "+w4.fins_prens+" ->	Billion");
	}

}
