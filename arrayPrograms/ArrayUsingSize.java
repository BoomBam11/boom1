package arrayPrograms;

import java.util.Scanner;

public class ArrayUsingSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an array : ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " the element : ");
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
