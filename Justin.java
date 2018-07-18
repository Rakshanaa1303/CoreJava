package myFirstProject;

public class Justin {

	public static void main(String[] args) {
		
		double sal = 55555.55;
		double tax = sal*20/100;
		double bonus = sal*15/100;
		double utility = sal*15/100;
		double lunch = sal*50/100;
		
		double total = sal-tax+bonus-utility-lunch;
		System.out.println(total);

	}

}
