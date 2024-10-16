package strings.case_convert;

public class UpperToLower {
	public static void main(String[] args) {
		String str = "JavA@ proGramMiNg123";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String lower = new String(ch);
		System.out.println(lower);
	}
}
