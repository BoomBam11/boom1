package patterns;

public class p13 {
	public static void main(String[] args) {
		int n = 5;
		for (int r = 1; r <= n; r++) {
			int coeff = 1;
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(coeff + " ");
				} else {
					System.out.print("  ");
				}
				coeff = (coeff * (r - c)) / c;
			}
			System.out.println();
		}
	}
}
