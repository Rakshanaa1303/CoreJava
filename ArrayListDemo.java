package unuploaded;


import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Java");
		ll.add("C++");
		ll.add("PHP");
		ll.add("Python");
		ll.add("C#");
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		Iterator<String> ii = ll.iterator();
		
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}

		ListIterator<String> i = ll.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
