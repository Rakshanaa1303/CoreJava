package myFirstProject;

public class Car {
	
	String carName;
	double mileage;
	double price;
	boolean luxuryType;
	
	public void setCarDetails(String carName, double mileage, double price, boolean luxuryType)
	{
		this.carName=carName;
		this.mileage=mileage;
		this.price=price;
		this.luxuryType=luxuryType;
	}
	
	public void printCarDetails()
	{
		System.out.println(carName);
		System.out.println(mileage);
		System.out.println(price);
		System.out.println(luxuryType);
		System.out.println("\n");
	}
	
	

}
