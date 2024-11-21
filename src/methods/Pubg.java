package methods;
public class Pubg {
	String name="BGMI (BATTLE GROUND MOBILE INDIA)";
	String storage="1.5 GB";
	double version=2.4;
	public void erangle(){
      System.out.println(name);
      System.out.println(version);
      System.out.println("40 mins to play erangle in "+name);
	}
	public void Livik(){
		System.out.println(name);
		System.out.println(version);
		System.out.println("15 mins to play Livik in "+name);
	}
	public static void main(String[] args){
		Pubg g1= new Pubg();
		System.out.println("The TOP GAME in INDIA "+g1.name+" version is "+g1.version+" & storage is "+g1.storage);
		g1.erangle();
		g1.Livik();
		System.out.println("THANK YOU FOR HAVING THIS GAME :) ~~[come again]~~ ");
	}
}