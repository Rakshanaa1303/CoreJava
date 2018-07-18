package myFirstProject;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		double sal=15000;
		double tax=(sal*10.0)/100.0;
		double allowance=(sal*15.0)/100.0;
		double netSal=sal-tax+allowance;
		System.out.println("The given salary is "+sal);
		System.out.println("The tax is           "+tax);
		System.out.println("The allowance is     "+allowance);
		System.out.println("The net salary is   "+netSal);
	}

}