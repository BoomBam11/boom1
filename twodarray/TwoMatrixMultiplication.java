package twodarray;

public class TwoMatrixMultiplication {

    public static void main(String[] args) {
        int[][] a = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };

        int[][] b = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };

        int[][] c = new int[3][3];  // Initialize a 3x3 result matrix

        // Matrix multiplication logic
        for (int i = 0; i < a.length; i++) {  // Outer loop for rows of `a`
            for (int j = 0; j < a.length; j++) {  // Middle loop for columns of `b`
                for (int k = 0; k < a.length; k++) {  // Inner loop for dot product calculation
                    c[i][j] += a[i][k] * b[k][j];  // Calculate the dot product and sum it up
                }
            }
        }

        // Print the result matrix
        for (int[] row : c) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
