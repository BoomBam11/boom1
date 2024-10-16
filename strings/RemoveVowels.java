package strings;

//WAP to remove all the vowels from the string
//WAP to remove all the consonants from the string
//WAP to remove all the spaces from the string
//WAP to remove all the digits from the string
//WAP to remove the given character from the string

public class RemoveVowels {
	public static void main(String[] args) {
		// WAP to remove all the vowels from the string
		//display consonants
		String str = "education";// hello world
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u') {
				output = output + str.charAt(i);
			}
		}
		System.out.println(output);

		// WAP to remove all the consonants from the string
		//display vowels
		System.out.println("removeConsonants " + removeConsonants(str));
	}

	public static String removeConsonants(String str) {

		String out = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				out = out + ch;
			}

		}
		return out;

	}
	
	
	
}
