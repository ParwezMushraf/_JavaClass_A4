package methods;

public class studentdetails {
	
	String name="Parwez";
	String qualification="B.COM";
	String Stream="Accounts & Finance(HONS)";
	double sem1=85.0;
	double sem2=87.0;
	double sem3=88.0;
	double sem4=90.0;
	double sem5=91.0;
	double sem6=100.0;
	
	public double overallpercentage()
	{
	double total=(sem1+sem2+sem3+sem4+sem5+sem6)/6;
	System.out.println(total+"%");
	return total;
	}
	
	public void details()
	{
	double t1=overallpercentage();
	System.out.println(name+" "+"is a "+ qualification+" "+"graduate"+" "+"in the stream of " 
		+Stream+" with the percentage of "+t1);
	}

	public static void main(String[] args) {
		studentdetails s1=new studentdetails();
	    s1.overallpercentage();
	    s1.details();
	}

}
