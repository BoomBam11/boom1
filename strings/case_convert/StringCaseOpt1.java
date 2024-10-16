package strings.case_convert;

public class StringCaseOpt1 {
	public static void main(String[] args) {
		String string = "HelloWorld";

		char[] ch = string.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = (char) (ch[i] + 32);// to lower add 32 in upper
			} else if (Character.isLowerCase(ch[i])) {
				ch[i] = (char) (ch[i] - 32);// to upper minus 32 in lower
			}
		}
		String updatedString = new String(ch);
		System.out.println(updatedString);

//		String str = "HelloWorld";
//		
//		String str1 ="";
//		
//		for (int i = 0; i < str.length(); i++) {
//			
//			str.charAt(i);
//			
//		}
//		

	}
}
