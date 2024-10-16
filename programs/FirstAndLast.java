package programs;

public class FirstAndLast {

	public static void main(String[] args) {
		int n = 98217;
		int totalDigits = (int) Math.log10(n); // to get total digit + 1 	
//		System.out.println(totalDigits+1);
		int firstDigit = (int) (n / Math.pow(10, totalDigits));
		//First Digit = (number/ 10 ^ totalDigits -1);
		System.out.println("firstDigit " + firstDigit);
		System.out.println("lastDigit " + n % 10);
	}

}
