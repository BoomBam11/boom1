package strings;

import java.util.Set;
import java.util.TreeSet;

public class Pangram2Collection {

	public static void main(String[] args) {
		// using array
		String str = "The quick brown fox jumps over the lazy dog.";
		str=str.toLowerCase();
		Set<Character> set = new TreeSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				set.add(str.charAt(i));
			}
		}
		System.out.println(set.toString());

		if (set.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");

		}

	}

}
