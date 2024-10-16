package strings;

//last and second last separated by space of a string.
//t a

public class StringOpt2 {

	public static void main(String[] args) {
		String str = "bat";
		int n = str.length();
		String newstr = str.charAt(n - 1) + " " + str.charAt(n - 2);

//		for (int i = str.length()-1; i >=str.length()-2; i--) {
//			char ch = str.charAt(i);
//			newstr = newstr+ch+" ";			
//		}

		System.out.println(newstr);
	}

}
