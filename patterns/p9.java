package patterns;

public class p9 {
	public static void main(String[] args) {
		int row = 5;
		int colmn = row * 2 - 1;
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= colmn; c++) {
				if (r + c == row + 1 || r == row || c - r == row - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


//         *         
//       *   *       
//     *       *     
//   *           *   
// * * * * * * * * * 
