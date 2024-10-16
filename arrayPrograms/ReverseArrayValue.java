/*
 * write a program to reverse each element of array
input - 5

85 34 61 27 96


output - reverse the element/value of array not the full array
58 43 16 72 69
*/


package arrayPrograms;

import java.util.Scanner;

public class ReverseArrayValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an Array:");
		int size = scanner.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value of " + i + "the index : ");
			a[i] = scanner.nextInt();
		}

		//reverse whole array
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
		
		for (int i = 0; i < a.length; i++) {
			int reverse = 0;
			while (a[i] != 0) {
				int digit = a[i] % 10;
				reverse = reverse * 10 + digit;
				a[i] = a[i] / 10;
			}
			System.out.print(reverse + " ");
		}
		
		
		
		
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);  array will be empty 
//		}

	}
}
