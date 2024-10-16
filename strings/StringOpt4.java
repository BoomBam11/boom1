package strings;

public class StringOpt4 {

	public static void main(String[] args) {

		String string = "Where are you? Meet me near the clock tower.";

		String[] strArr = string.split(" ");

		for (int i = 0; i < strArr.length; i++) {

			int x = i % 3;
			if (x == 0) {
				System.out.print(vowels(strArr[i]) + " ");
			} else if (x == 1) {
				System.out.print(consonants(strArr[i]) + " ");

			} else {
				System.out.print(strArr[i].toUpperCase() + " ");

			}
		}

	}

	public static String consonants(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if ( Character.isAlphabetic(ch[i]) && !(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')) {

				ch[i] = '#';

			}

		}

		return new String(ch);

	}

	public static String vowels(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				ch[i] = '%';

			}

		}

		return new String(ch);

	}

}
