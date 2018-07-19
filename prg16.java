package Programs;

public class prg16 {

	public static void main(String[] args) {
		
		int a=11, b=20, c=33, sum=0;
		if((a%2)!=0) {
			sum=sum+a;
		}
		if((b%2)!=0) {
			sum=sum+b;
		}
		if((c%2)!=0) {
			sum=sum+c;
		}
		
		System.out.println("The sum of odd numbers is "+sum);

	}

}
