package strings;

public class StringPassword {
	public static void main(String[] args) {
		String password = "Jspiders@123";

		if (password.length() >= 8) {

			boolean isUpper = false, isLower = false, isDigit = false, isSpecial = false;

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);

				if (ch >= 'A' && ch <= 'Z') {
					isUpper = true;
				} else if (ch >= 'a' && ch <= 'z') {
					isLower = true;
				} else if (ch >= '0' && ch <= '9') {
					isDigit = true;
				} else {
					isSpecial = true;
				}

			}
			if (isUpper && isLower && isDigit && isSpecial) {
				System.out.println("Strong Password");
			} else {
				System.out.println("Not a Strong Password");
			}

		} else {
			System.out.println("Not a Strong Password");
		}

	}
}
