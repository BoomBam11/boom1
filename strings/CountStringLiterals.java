package strings;

public class CountStringLiterals {
	public static void main(String[] args) {
		String str = "ahiaaahiaahiahiaahi";

		System.out.println(count(str, 0, 0));
		System.out.println(countHi(str));

	}

	public static int count(String str, int i, int counter) {

//		char ch = str.charAt(i);
		if (i < str.length()) {

			if (str.charAt(i) == 'h') {
				if (str.charAt(i + 1) == 'i') {
					counter++;
				}

			}
			i++;

			return count(str, i, counter);
		}

		return counter;
	}

	public static int countHi(String s) {
		if (s.contains("hi")) {
			return 1 + countHi(s.substring(s.indexOf("hi") + 2));
		} else {
			return 0;
		}
	}

}
