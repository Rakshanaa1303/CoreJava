package myFirstProject;

public class PatternNum {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<i; j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		for(int i=8;i>=1;i--)
		{
			for(int j=0;j<i; j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}

	}

}
