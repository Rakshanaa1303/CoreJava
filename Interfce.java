package unuploaded;
interface comparison
{
	public void whichIsGreater(Object o1, Object o2);
}

class Employee implements comparison
{
	String ename;
	double salary;
	public Employee(String ename, double salary)
	{
		this.ename = ename;
		this.salary = salary; 
	}
	
	public void whichIsGreater(Object o1, Object o2) {
		Employee e = (Employee)o1;
		Employee e1 = (Employee)o2;
		if(e.salary>e1.salary) {
			System.out.println(e.ename +" is greater");
		}
		else
		{
			System.out.println(e1.ename +" is greater");
		}
		
	}
	
}

class Apple implements comparison
{
	String source;
	double price;
	public Apple(String source, double price)
	{
		this.source = source;
		this.price = price; 
	}
	public void whichIsGreater(Object o1, Object o2)
	{
		Apple a = (Apple)o1;
		Apple a1 = (Apple)o2;
		if(a.price>a1.price) {
			System.out.println(a.source +" is greater");
		}
		else
		{
			System.out.println(a1.source +" is greater");
		}
	}
	
}
public class Interfce {

	public static void main(String[] args) {
		Employee e1 = new Employee("emp1", 25000.00);
		Employee e2 = new Employee("emp2", 50000.00);
		Employee e3 = new Employee(null, 0);
		
		e3.whichIsGreater(e1, e2);
		
		Apple a1 = new Apple("Kashmir", 2345.22);
		Apple a2 = new Apple("Washington", 3333.22);
		Apple a3 = new Apple(null, 0);
		
		a3.whichIsGreater(a1, a2);
		
		

	}

}
