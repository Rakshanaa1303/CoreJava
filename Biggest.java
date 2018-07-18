package myFirstProject;

public class Biggest {

	public static void main(String[] args) {
		int a=0, b=0;
		
		if(a==0 && b==0) {
			System.out.println("Both cannot be zero");
		}
		else if(a>b) {
			System.out.println(a+" is the biggest number");
		}
		else if(b>a){
			System.out.println(b+" is the biggest number");
		}
		else {
			System.out.println("Both are equal");
		}
	}

}
