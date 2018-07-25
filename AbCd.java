package unuploaded;

import java.util.*;

class car implements Comparable<Object>
{
	String color;
	String car;
	double price;
	
	
	public car(String color, String car, double price) {
		super();
		this.color = color;
		this.car = car;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.color+" "+this.car+" "+this.price;
	}
	
	public int compareTo(Object o)
	{
		car c = (car)o;
		int ret = 0;
		
		if(this.price == c.price)	ret= 0;
		else if(this.price<c.price)	ret= -1;
		else if(this.price>c.price)ret= 1;
		return ret;
		
			
	}
	
	
}
public class AbCd {

	public static void main(String[] args) {
		
		car c1 = new car("a", "bmw", 3000);
		car c2 = new car("b", "ford", 2000);
		car c3 = new car("c", "maruti", 1000);
		car c4 = new car("d", "jaguvar", 5000);
		car c5 = new car("e", "audi", 4000);
		
		ArrayList<car> a = new ArrayList<car>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		a.add(c5);
		
		System.out.println(a);
		
		Collections.sort(a);
		
		System.out.println(a);
	}
}
