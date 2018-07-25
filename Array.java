package unuploaded;

class product
{
	String name;
	double price;
	
	public product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
public class Array {

	public static void main(String[] args) {
		product p1 = new product("tv", 3345.25);
		product p2 = new product("sofa", 458952.89);
		product p3 = new product("laptop", 80000.00);
		
		product arr[] = {p1, p2, p3};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Name: "+arr[i].name);
			System.out.println("Price: "+arr[i].price);
		}

	}

}
