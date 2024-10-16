package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n = sc.nextInt();
//		fact(n);
//		factor(n);
//		methodEven(n);
		System.out.println(perfectNum(n));

	}

	static void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

	// calculates the product of all even numbers from 1 to n and prints those even numbers followed by the product.
	static void methodEven(int n) {
		int result = 1;//The variable result is initialized to 1. This will hold the product of all even numbers in the range
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				// even
				result = result * i;
				System.out.print(i+" ");
			} else {
				// odd
//				System.out.print(i+" ");//to print only odd numbers
			}
			
		}
		System.out.println(" = "+result);
	}

	
	//A factor of a number is an integer that divides that number exactly without leaving a remainder
	// calculate factor of number => 6--> 1 2 3 6
//	static void factor(int n) {
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.print(i + " ");
//			}
//		}
//	}
	//optimized
	static void factor(int n) {
		System.out.print(1+" ");//cause we know 1 and that number are factor of that number
		for (int i = 2; i <=n/2; i++) {// n/2 cause factor never be more than half of the that number
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);//cause we know 1 and that number are factor of that number
	}
	
	
	
		

	//perfect number is a positive integer number equals to the sum of its proper divisors, excluding itself.
	//6 = 1+2+3 ->true
	//7 = 1 ->false
	
	/*
	 * For the number 1:
	 * The only proper divisor of 1 is 1 itself, but we exclude the number itself when summing proper divisors.
	 * Therefore, the sum of the proper divisors of 1 is 0, not 1.
	 * */
	static boolean perfectNum(int n) {
		int store = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				store = store + i;
				System.out.print(i + " ");
			}
			if (n == store) {
				return true;
			}
		}
		return false;

	}
	
//	multiplication table of number in range 1-5

}
