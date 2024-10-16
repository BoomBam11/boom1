package programs;

import java.util.Scanner;

//armstrong number like 153
// 1^3 +5^3 +3^3
/*
	1) count the number of digits
	2) write function to calculate power 
	3) add digits
*/

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// 153/371
		int sum = 0, temp = n;
		int countOfDigits = countDigits(n);

		while (n != 0) {
			int digit = n % 10;
			sum = sum + pow(digit, countOfDigits);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armsjtrong Number");

		}

	}

	static int pow(int n, int p) {
		int prod = 1;
		for (int i = 1; i <= p; i++) {
			prod = prod * n;
		}
		return prod;
	}

	static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
//			int digit=n%10;
			count++;
			n = n / 10;

		}
		return count;

	}

}
