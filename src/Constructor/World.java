package Constructor;

public class World {
	String name;
	int states;
	String cur_name;
	double fins_prens;
	public World(String name) {
		this.name=name;
	}
	public World(String name,int states) {
		this.name=name;
		this.states=states;
	}
	public World(String name,int states,String cur_name) {
		this.name=name;
		this.states=states;
		this.cur_name=cur_name;
	}
	public World(String name,int states,String cur_name,double fins_prens) {
		this.name=name;
		this.states=states;
		this.cur_name=cur_name;
		this.fins_prens=fins_prens;
	}
}
