package unuploaded;

public class Enum {

	enum weekday{Sunday, Monday, Tuesday, Wednesday, Thuersday, Friday, Saturday};
	
	public static void main(String[] args) {
		
		weekday[] w = weekday.values();
		for(weekday w1:w)
		{
			System.out.println(w1);
		}
		System.out.println("\n" + weekday.Tuesday);
		
	}

}
 