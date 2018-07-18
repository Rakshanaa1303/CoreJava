package myFirstProject;

public class Product {

	public static void main(String[] args) {
		double p1=82.5, p2=90, p3=576;
		if(p1>p2)
		{
			if(p1>p3)
			{
				System.out.println(p1+" is greater");
			}
			else
			{
				System.out.println(p3+" is greater");
			}
				
		}
		else if(p2>p3)
		{
			System.out.println(p2+" is greater");
		}
		else
		{
			System.out.println(p3+" is greater");
		}
		
	}

}
