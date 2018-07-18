package myFirstProject;

public class Emoloyee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	static String companyname="DELOITTE";
	
	public double calculateSalary()
	{
		double bonus= 0.0;
		if(this.employeeSalary<=5000)
			bonus = this.employeeSalary*0.2;
		else
			bonus=this.employeeSalary*0.1;
		return bonus;
		
	}
	
	public Emoloyee() {
		super();
		this.employeeId = 12;
		this.employeeName = "Rakshanaa";
		this.employeeSalary = 3500.00;
		System.out.println(this.employeeId);
		System.out.println(this.employeeName);
		System.out.println(this.employeeSalary);
	}

	public Emoloyee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		System.out.println(this.employeeId);
		System.out.println(this.employeeName);
		System.out.println(this.employeeSalary);
	}
	public static String getCompany()
	{
		return companyname;
	}


	
}
