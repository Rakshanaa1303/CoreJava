package unuploaded;

public class PasswordValidator {

	public static void main(String[] args) {
		
		String password = "Raksh@1303";
		
		char array[] = password.toCharArray();
		
		int upper=0, digit=0, spl=0, white=0, len = array.length;
		
	
			for(int i=0;i<array.length;i++)
			{
				if(Character.isUpperCase(array[i]))
				{
					upper=1;
				}
				if(Character.isDigit(array[i]))
				{
					digit=1;
				}
				if(Character.isWhitespace(array[i]))
				{
					white=1;
				}
				else
				{
					spl=1;
				}
			}
		
		if(len>=5 && len<=10 && upper==1 && digit==1 && white!=1 && spl==1) {
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Enter a valid password");
		}
	}
}