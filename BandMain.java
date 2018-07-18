package myFirstProject;

public class BandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Band b1 = new Band();
		Band b2 = new Band();
		
		String singers1[]={"sing1","sing2", "sing3"};
		String guitarists1[]={"guitar1", "guitar2"}; 
		
		String singers2[]={"sing1"};
		String guitarists2[]={"guitar1", "guitar2"}; 
		
		b1.setBandDetails("Raksh", singers1, guitarists1, "drummer", "keyBoardPlayer");
		b2.setBandDetails("Jaya", singers2, guitarists2, "drummer", "keyBoardPlayer");
		
		b1.printBandDetails();
		b2.printBandDetails();
		
		int a=b1.count();
		int b=b2.count();
		
		if(a>b) {
			System.out.println("The band b1 has more artists");
		}
		else {
			System.out.println("The band b2 has more artists");
		}
		
	}

}
