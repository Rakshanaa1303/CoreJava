package unuploaded;

import java.util.HashSet;

class MobilePhone
{
	String name;
	int price;
	
	public MobilePhone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return this.name+" "+this.price;
	}
	
	
	@Override
	public int hashCode() {
		return this.price*5;
	}
	
	@Override
	public boolean equals(Object obj) {
		MobilePhone mm = (MobilePhone)obj;
		if(this.name.equals(mm.name) && this.price==mm.price)
			return true;
		else
			return false;
	}
}

public class SetUserDefinedDemo {

	public static void main(String[] args) {
		
		MobilePhone m1 = new MobilePhone("Samsung", 12000);
		MobilePhone m2 = new MobilePhone("Samsung", 12000);
		
		HashSet<MobilePhone> h1 = new HashSet<MobilePhone>();
		
		h1.add(m1);
		h1.add(m2);
		
		System.out.println(h1);
		
		
	}

}
