package strings.case_convert;

public class LowerToUpper {

	public static void main(String[] args) {
		String str = "javA@ proGrammin123";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {// if(ch[i]>='a' && ch[i]<='z')
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String upper = new String(ch);
		System.out.println(upper);
	}

}
