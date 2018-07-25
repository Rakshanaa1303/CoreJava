package unuploaded;

public class Append {

	public static void main(String[] args)
	{
		
		String a = "RakshanaaDharanidharan";
		
		char arr[]=a.toCharArray();
		
		char an;
		int d=arr.length;
		for(int i=0;i<d;i++)
		{
			an=arr[i];
			arr[i]=arr[d-1];
			arr[d-1] = an;
			d--;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
	}
}
