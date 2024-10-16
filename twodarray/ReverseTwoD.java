package twodarray;
//wap to reverse each element of an array
public class ReverseTwoD {
	public static void main(String[] args) {
		int[][] a = { { 35, 65, 12 }, { 74, 32, 84 }, { 96, 34, 89 } };

				
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(reverse(a[i][j])+" ");
			}
			System.out.println();
		}
	}

	public static int reverse(int n) {

		int reverse = 0;

		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		return reverse;
	}

}
