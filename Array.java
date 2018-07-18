package myFirstProject;

public class Array {

	public static void main(String[] args) {

		int arr[] = { 50, 5, 5, 5, 5 };

		// Printing the array

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n");

		// Printing the reverse of an array

		for (int i = 4; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");

		// Checking whether the given number is available

		int flag = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] == 26) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("The element 26 is not found");
		} else {
			System.out.println("The element 26 is found");
		}

		// Finding the biggest

		int a = arr[0];
		for (int i = 0; i < 5; i++) {

			if (a < arr[i]) {
				a = arr[i];
			}
		}
		System.out.println("The biggest number is " + a);

		// Finding the smallest

		int b = arr[0];
		for (int i = 0; i < 5; i++) {

			if (b > arr[i]) {
				b = arr[i];
			}
		}
		System.out.println("The smallest number is " + b);

		// Sum of all the numbers

		int c = 0;
		for (int i = 0; i < 5; i++) {
			c += arr[i];
		}
		System.out.println("Sum of all the elements is " + c);

		// Sum of even numbers

		int d = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				d += arr[i];
			}
		}
		System.out.println("Sum of even numbers is " + d);

		// String array

		String array[] = { "Raksh", "Dharani", "Rishi", "Guru", "Jaya" };
		int found = 0, pos = 0;
		for (int i = 0; i < 5; i++) {
			if (array[i].equals("Guru")) {
				found = 1;
				pos = i;
				break;
			}
		}
		if (found == 1) {
			System.out.println("The position of GURU is " + pos);
		} else {
			System.out.println("The name Guru is not found");
		}

		// Array to find all red colours

		String array1[] = { "Red", "Yellow", "Green", "Red", "Red", "Yellow", "Green", "Red", "Green", "Red", "Black" };
		String array2[] = { "Red", "Yellow", "Green", "Red", "Red", "Yellow", "Green", "Red", "Green", "Red", "White" };

		int count = 0;

		for (int i = 0; i < 10; i++) {
			if (array1[i].equals("Red")) {
				count++;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (array2[i].equals("Red")) {
				count++;
			}
		}

		System.out.println("The total red balls are " + count);

		// Find the capital

		String array3[] = { "India", "Tamilnadu", "Karnataka" };
		String array4[] = { "Delhi", "Chennai", "Bangalore" };
		String input = "India";
		int g=0;
		for (int i = 0; i < 2; i++) {
			if (array3[i].equals(input)) {
				System.out.println("The capital of " + input + " is " + array4[i]);
				g=1;
				break;
			}
		}
		

	}
}
