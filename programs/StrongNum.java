package programs;

/*
 * 
 * WAP to check if the number is a Strong Number or not.
A number is called strong number if sum of the factorial of its digit is equal to number itself.

For example: 145

since

1! + 4! + 5! = 1 + 24 + 120 = 145

So, 145 is a Strong number. Now given a positive number N and you have to find the number is strong number or not . 
*/
public class StrongNum {
	public static void main(String[] args) {
		int n = 40585;// 145 // 2
		int sum = 0, temp = n;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + factorial(digit);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}

	}

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

}
