package practice2;

public class Panagram {

	public static void main(String[] args) {
		// using array
		String str = "The Quick brown fox jumps over the lazy dog.";
		str = str.toLowerCase();
		boolean[] b = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				int x = str.charAt(i) - 'a';
				b[x] = true;
			}

		}

		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == true) {
				count++;
			}
		}
		if (count == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");

		}

	}

}

