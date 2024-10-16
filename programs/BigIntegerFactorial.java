package programs;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc .nextInt();
//		BigInteger n = sc .nextBigInteger();

		BigInteger fact = BigInteger.valueOf(1);//BigInteger.ONE;
		for (int i = 1; i <=n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
