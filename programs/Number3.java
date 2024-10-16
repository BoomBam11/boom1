package programs;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		reverseMethod(n);
//		palindromeNum(n);
		
		System.out.println(isPalindrome(n));
		
		
	}
	
	 public static boolean isPalindrome(int x) {
	        String rev="";
	        String og = String.valueOf(x);
	        while(x!=0){
	            int digit = x%10;
	            rev = rev+digit;
	            x=x/10;
	        }
	     
	        System.out.println(rev);
	        System.out.println(og);
	        return rev.equals(og)?true:false;

	    }

	// wap to reverse a number
	static void reverseMethod(int n) {

		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;// to separate digit 10 cause we are using base10 number system
			reverse = reverse * 10 + digit;// to shift digit
			n = n / 10;//
		}
		System.out.println(reverse);
	}
	
	

	// wap to check palindrome number
	static void palindromeNum(int n) {
		int og = n;
		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if (reverse == og) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is Not a Palindrome");

		}
	}

}
