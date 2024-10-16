package yt_pattern;

public class P1 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println();
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
//		pattern6(n);
//		pattern7(n);
//		pattern8(n);
		pattern9(n);
		

	}

	public static void pattern9(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}

			System.out.println();
		}

		for (int row = 0; row <= n; row++) {
			// for spaces
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= 2 * n - (2 * row + 1); star++) {
				System.out.print("*");
			}

			// for spaces
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}

			System.out.println();

		}

	}

	public static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			// for spaces
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= 2 * n - (2 * row + 1); star++) {
				System.out.print("*");
			}

			// for spaces
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}

			System.out.println();

		}
	}

	public static void pattern7(int n) {

		for (int row = 1; row <= n; row++) {
			// for spaces
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			// for star
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			// for spaces
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			System.out.println();

		}

	}

	public static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();

		}

	}

	public static void pattern4(int n) {
		// outer for loop for rows or lines
		for (int row = 1; row <= 2 * n; row++) {
			// inner for loop for columns
			int formula = row;
			if (row > n) {
				formula = 2 * n - row;
			}
			for (int col = 1; col <= formula; col++) {// n-row
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern3(int n) {
		// outer for loop for rows or lines
		for (int row = 1; row <= n; row++) {
			// inner for loop for columns
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		// outer for loop for rows or lines
		for (int row = 1; row <= n; row++) {
			// inner for loop for columns
			for (int col = n; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern1(int n) {
		// outer for loop for rows or lines
		for (int i = 1; i <= n; i++) {
			// inner for loop for columns
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
