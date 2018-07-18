package myFirstProject;

public class EmployeeMain {

	public static void main(String[] args) {
		Emoloyee e1=new Emoloyee(12, "Raksh", 2134.2);
		Emoloyee e2=new Emoloyee();
		double bonus = e2.calculateSalary();
		System.out.println(bonus);
		
		System.out.println();
	}

}
