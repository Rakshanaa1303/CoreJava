package unuploaded;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(6);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		
		a2.add(0);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		a2.add(0);
		
		
		Collections.shuffle(a1);
		System.out.println(a1);
		
		System.out.println(Collections.frequency(a1, 6));
		
		System.out.println(Collections.max(a1));
		
		System.out.println(Collections.min(a1));
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		Collections.copy(a2, a1);
		System.out.println(a2);
		
		Collections.fill(a1, 0);
		System.out.println(a1);
		
	}

}
