package strings;

public class Test {
	public static void main(String[] args) {
		String s = "m1n7a";// 3mna8

		var sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				sum+=ch;
			}else if (Character.isAlphabetic(ch)) {
				
			}

		}

	}
}
