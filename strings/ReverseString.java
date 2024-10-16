package strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "thane is city";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		String rev1 = "";
		for (int i = 0; i < str.length(); i++) {
			rev1 = str.charAt(i) + rev1;
		}

//		System.out.println(reverse);
//		System.out.println(rev1);

//		convertReverse(str);
		usingSplit(str);
		
		
		
	}

	public static void convertReverse(String str) {

		String word = "";
		String updatedString = "";
//		int index = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;

			} else {
				updatedString = reverse(word);
				System.out.print(updatedString + " ");
				word = "";

			}

		}
		System.out.println(reverse(word));

	}

	public static String reverse(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}

		return reverse;
	}

	public static void usingSplit(String str) {
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(reverse(arr[i]) + " ");
		}

	}

}
