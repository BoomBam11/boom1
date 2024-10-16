package twodarray;

public class TwoDifferentSizeMatrixMultiplication {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 },
			      { 4, 5, 6 },
			      { 7, 8, 9 } };

	int[][] b = { { 1, 2, 3 }, 
			      { 4, 5, 6 }, 
			      { 7, 8, 9 } };


//	int[][] a = {
//            {1, 2, 3},
//            {4, 5, 6}
//        };
//
//        int[][] b = {
		//            {7, 8},
		//            {9, 10},
		//            {11, 12}
		//        };

		matrix_multiplication(a.length, a[0].length, a, b.length, b[0].length, b);
	}

	public static void matrix_multiplication(int rowA, int colA, int[][] a, int rowB, int colB, int[][] b) {
		// Check if the number of columns in A is equal to the number of rows in B
		if (colA != rowB) {
			System.out.println("Matrix multiplication not possible");
			return;
		}

		int[][] c = new int[rowA][colB];

		// Perform matrix multiplication
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				for (int k = 0; k < colA; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		// Print the resulting matrix
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
