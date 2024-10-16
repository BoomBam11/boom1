package twodarray;

public class MatrixOperation {

	public static void main(String[] args) {
		int[][] a = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int x = 55;

		int indexSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (x == a[i][j]) {
					indexSum = i + j;
					break;
				}

			}
		}

		int sum = 0;
		if (indexSum % 2 == 0) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] % 2 == 0) {
						while (a[i][j] != 0) {
							int digit = a[i][j] % 10;
							sum = sum + digit;
							a[i][j] = a[i][j] / 10;
						}
					}

				}
			}

		} else {

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] % 2 != 0) {
						while (a[i][j] != 0) {
							int digit = a[i][j] % 10;
							sum = sum + digit;
							a[i][j] = a[i][j] / 10;
						}
					}

				}
			}

		}
		System.out.println(sum);

	}

}
