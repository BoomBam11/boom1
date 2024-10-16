package strings;

// Lexicographical Order
public class StringSort {
	public static void main(String[] args) {
		String[] a = { "orange", "apple", "mango", "kiwi", "grape" };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {// a[j].compareToIgnoreCase(a[j + 1])
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		for (String string : a) {
			System.out.println(string);
		}

	}
}
