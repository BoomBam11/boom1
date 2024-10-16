package arrayPrograms;

import java.util.Scanner;


//product of odd value(elements)

public class ProductOfOddValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " th element  of array :");
			a[i] = scanner.nextInt();
		}
		int prod = 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				prod = prod * a[i];
			}
		}
		System.out.println(prod);

	}
}
