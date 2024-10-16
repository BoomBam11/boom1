package patterns;

public class p10 {
	public static void main(String[] args) {
		int row = 5;
		int colmn = 5;
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= colmn; c++) {
				if (r>=c) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
