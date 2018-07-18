package myFirstProject;

class cot
{
	double price;
}
class chair
{
	double price;
}
class dinningTable
{
	double price;
}
class furniture 
{
	public double calculateArea(cot c)
	{
		return c.price*0.1;
	}
	public double calculateArea(chair cc)
	{
		return cc.price*0.2;
	}
	public double calculateArea(dinningTable d)
	{
		return d.price*0.3;
	}
}
public class MethodOverloading {

	
	public static void main(String[] args) {
	
		cot c = new cot();
		c.price=25000;
		
		chair cc = new chair();
		cc.price=25000;

		
		dinningTable d = new dinningTable();
		d.price=25000;
		
		furniture f = new furniture();
		double cotDiscount = f.calculateArea(c);
		System.out.println("Cot discount is "+cotDiscount);


	}

}
