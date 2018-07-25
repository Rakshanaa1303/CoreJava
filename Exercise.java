package unuploaded;

public class Exercise {

	public static void main(String[] args) {
		
		String company = "Deloitte works for 9 hours *";
		char array[] = company.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			if(Character.isDigit(array[i]))
			{
				System.out.println(array[i]+" is a number");
			}
			else if(Character.isLetter(array[i]))
			{
				System.out.println(array[i]+" is a letter");
			}
			else if(Character.isWhitespace(array[i]))
			{
				System.out.println(array[i]+" is a blank space");
			}
			else
			{
				System.out.println(array[i]+" is a special character");
			}
		}
		
		
		
		

	}

}
