package programs;

public class Number {

	public static void main(String[] args) {
		int n = 1684;

		while (n != 0) {//n =1684
			int digit = n % 10; //to get remainder as 4
			System.out.println(digit);//printing digit
			n = n / 10;//to get quotient as 168 = n
		}

	}

}
