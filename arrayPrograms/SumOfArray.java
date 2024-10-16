package arrayPrograms;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the "+ i +" th element  of array :");
			a[i]= scanner.nextInt();
		}
		
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);
		
	}
}
