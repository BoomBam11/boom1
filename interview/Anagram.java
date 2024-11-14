package practice2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "act";

		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an Anagram");
			}

		} else {
			System.out.println("Not an anagram lenght not same");
		}

	}
}
