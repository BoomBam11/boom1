package strings;

public class StringOpt3 {

	public static void main(String[] args) {
//		String str= "capiTalIze tHe titLe";
		String str = "First leTTer OF EACH Word";

		String wordArr[] = str.split(" ");

		for (int i = 0; i < wordArr.length; i++) {

			if (wordArr[i].length() > 2) {
				char[] ch = wordArr[i].toCharArray();

				if (ch[0] >= 'a' && ch[0] <= 'z') {
					ch[0] = (char) (ch[0] - 32);
				}

				for (int j = 1; j < ch.length; j++) {
					if (ch[j] >= 'A' && ch[j] <= 'Z') {
						ch[j] = (char) (ch[j] + 32);
					}
				}
				
				
//				for (char string : ch) {
//					System.out.print(string + " ");
//				}
//				
//				System.out.println("-------------------");

				wordArr[i] = new String(ch);

			} else {

				wordArr[i] = wordArr[i].toLowerCase();
			}

		}

		for (String string : wordArr) {
			System.out.print(string + " ");
		}

	}

}
