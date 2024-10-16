package strings;
//		input= "MU1M2B3A4I";
//		output = 6MUMBAI10

public class StringOpt {
	public static void main(String[] args) {
		String str = "MU1M2B3A4I";
		String strUpdate = "";

		int digitUpdate = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				strUpdate = strUpdate + ch;
			} else if (Character.isDigit(ch)) {
				digitUpdate = digitUpdate + ch - 48;// 48=='0'
			}

		}

		System.out.println(strUpdate.length() + strUpdate + digitUpdate);

	}
}
