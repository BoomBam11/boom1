package twodarray;

public class LargestFromEachRow {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, 
					  { 4, 5, 6 },
					  { 7, 8, 9 } };

		for (int i = 0; i < a.length; i++) {
			int largest = Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if (largest < a[i][j]) {
					largest = a[i][j];
				}
			}
			System.out.println(largest);

		}

	}
}
