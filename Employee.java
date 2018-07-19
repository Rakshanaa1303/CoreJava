class Employee1
{
	double salary;
	String name;
	int eid;
	String dept;
	Address add;
	
	Employee1(double salary, String name, int eid, String dept, Address add) {
		this.salary = salary;
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.add = add;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.eid);
		System.out.println(this.dept);
		add.printAddress();
	}
}
class Address
{
	int flatno;
	String apartmentName;
	String main;
	String cross;
	String city;
	long pincode;


Address(int flatno, String apartmentName, String main, String cross, String city, long pincode)
{
	this.flatno=flatno;
	this.apartmentName=apartmentName;
	this.main = main;
	this.cross = cross;
	this.city=city;
	this.pincode=pincode;
}

public void printAddress()
{
	System.out.println(this.flatno);
	System.out.println(this.apartmentName);
	System.out.println(this.main);
	System.out.println(this.cross);
	System.out.println(this.city);
    System.out.println(this.pincode);
}
}

public class Employee{
	
	public static void main(String args[]) {
		Address a = new Address(1, "Bluebell", "Marathahalli", "2nd cross street", "Bangalore", 641602L);
		Employee1 e = new Employee1(500000, "Raksh", 1303, "Associate analyst", a);
		e.printEmployeeDetails();
	}
}