package patterns;

public class p14 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 0; r < n; r++) { // Start from 0 to match row index with coefficient calculation
            int coeff = 1;
            
            // Print leading spaces for alignment
            for (int space = 0; space < n - r - 1; space++) {
                System.out.print(" ");
            }
            
            for (int c = 0; c <= r; c++) {
                System.out.print(coeff + " ");
                
                // Update the coefficient for the next position
                coeff = (coeff * (r - c)) / (c + 1);
            }
            System.out.println();
        }
    }
}



//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 
