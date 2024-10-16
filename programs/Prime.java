package programs;

import java.util.Scanner;

//Prime Number is a number who's divisible by 1 and itself only.
public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();

//		int count = 0;
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("Prime Number");
//		} else {
//			System.out.println("Not a Prime Number");
//
//		}

//		int c = 0;
//
//		while (n != 0) {
//			int count = 0;
//			for (int i = 1; i <=n; i++) {
//				if (n % i == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				c++;
//			}
//			n--;
//		}
//		System.out.println(c);

		
		
		//Correct Program
		
		int primeCount = 0;

		for (int i = 2; i < n; i++) {
			int factorsCount = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factorsCount++;
				}

			}

			if (factorsCount == 2) {
				primeCount++;
			}
		}

		System.out.println(primeCount);

	}

}
