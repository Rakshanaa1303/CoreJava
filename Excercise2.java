package unuploaded;

public class Excercise2 {

	public static void main(String[] args) {
		
		String a = "Cc";
		int c=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='c' || a.charAt(i)=='C')
			{
				c++;
			}
		}
		System.out.println("The lettet 'c' occurred "+c+" times");

	}

}
