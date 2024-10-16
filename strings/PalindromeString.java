package strings;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "maaM";// levEl//nitin

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
//		System.out.println(reverse);
		
		if (str.equals(reverse)) {// read question first
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		if (str.equalsIgnoreCase(reverse)) {// read question first
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}
