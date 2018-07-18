package myFirstProject;

public class CarMain {
	
	double chooseMyCart()
	{
		if(c1.mileage<10)
	}

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		
		c1.setCarDetails("Audi", 500, 81, true);
		c2.setCarDetails("BMW", 100, 8, true);
		c3.setCarDetails("Swift", 50, 7, false);
		c4.setCarDetails("Duster", 200, 6, true);
		c5.setCarDetails("Toyota", 150, 5, true);
		
		c1.printCarDetails();
		c2.printCarDetails();
		c3.printCarDetails();
		c4.printCarDetails();
		c5.printCarDetails();
		
		if(c1.price>c2.price && c1.price>c3.price && c1.price>c4.price && c1.price>c5.price)
		{
			System.out.println("The costliest car is "+c1.carName);
		}
		else if(c2.price>c1.price && c2.price>c3.price && c2.price>c4.price && c2.price>c5.price)
		{
			System.out.println("The costliest car is "+c2.carName);
		}
		else if(c3.price>c1.price && c3.price>c2.price && c3.price>c4.price && c3.price>c5.price)
		{
			System.out.println("The costliest car is "+c3.carName);
		}
		else if(c4.price>c1.price && c4.price>c3.price && c4.price>c2.price && c4.price>c5.price)
		{
			System.out.println("The costliest car is "+c4.carName);
		}
		else if(c5.price>c1.price && c5.price>c3.price && c5.price>c4.price && c5.price>c2.price)
		{
			System.out.println("The costliest car is "+c5.carName);
		}
		
	}

}

