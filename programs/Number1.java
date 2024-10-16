package programs;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();

//		evenMethod(n);
//		sumDigit(n);

//		sumEvenOdd(n);

		specialNumber(n);

//		nivenNum(n);

//		sumPrime(n);
//		SmartSumPrime(n);

	}

	// even digits from the number
	static void evenMethod(int n) {
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				System.out.println(digit);
			}
			n = n / 10;
		}
	}

	// find sum of all digits in the number
	static void sumDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println(sum);
	}

	// WAP to find product of sum of all even digit and sum of all odd digit

	static void sumEvenOdd(int n) {

		int evenSum = 0;
		int oddSum = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				evenSum = evenSum + digit;
			} else {
				oddSum = oddSum + digit;
			}
			n = n / 10;

		}
		System.out.println("Sum of Even Digits: " + evenSum);
		System.out.println("Sum of Odd Digits: " + oddSum);
		System.out.println("Product : " + evenSum * oddSum);
	}

	// WAP to check if the n number is special number
	// special number is addition of sum of digits and product of digits are equal
	// to the number itself.
	static void specialNumber(int n) {//19//29
		int og = n;
		int product = 1;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			product = product * digit;
			sum = sum + digit;
			n = n / 10;
		}

		if (og == product + sum) {
			System.out.println("special Number");
		} else {
			System.out.println("not special Number");
		}
	}

	// WAP to check if it is number is a Niven Number(Harshad's Number) or not.
	// A Harshad's Number is a number is divisible by sum of its digits;

	/*
	 * example , 21= 2+1 = 3 sum of digits 21%3 == 0 //divisible Its Mean its is a
	 * Niven Number.
	 */
	static void nivenNum(int n) {
		int og = n;
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;// sum of its digits
			n = n / 10;
		}
		if (og % sum == 0) {
			System.out.println("Harshad(Niven) Number");
		} else {

			System.out.println("Not a Harshad(Niven) Number");
		}
	}

	// find the sum of all prime digits of number
	// prime => 1 and iteself
	// 567 == 12
	static void sumPrime(int n) {
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;
			int count = 0;

			for (int i = 1; i <= digit; i++) {
				if (digit % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum = sum + digit;
			}
			n = n / 10;
		}

		System.out.println(sum);

	}

	//
	// find the sum of all prime digits of number
	// prime => 1 and iteself
	// 567 = 12
	static void SmartSumPrime(int n) {
		int sum = 0;

		while (n != 0) {
			int digit = n % 10;

			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				sum = sum + digit;
			}
			n = n / 10;
		}

		System.out.println(sum);

	}

}
