package strings;

// wap to count all the vowels present in the string.
// wap to count all the consonant present in the string.
// wap to count all the numeric present in the string.

public class CountVowels {
	public static void main(String[] args) {
		// wap to count all the vowels present in the string.

		String str = "education";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				count++;
			}
		}
		System.out.println(count);

		// wap to count all the consonant present in the string.

		System.out.println(consonant(str));

		// wap to count all the numeric present in the string.
		System.out.println(Num("anis123shah4565"));

	}

	public static int consonant(String str) {
		String output = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (!(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')) {
				count++;
			}
		}
		return count;
	}

	public static int Num(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}

		}

		return count;
	}

}
