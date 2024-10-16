package twodarray;

public class DifferenceOfSecondaryAndPrimaryDiagonal {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, 
					  { 4, 5, 6 }, 
					  { 9, 8, 9 } };

		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		for (int i = 0; i < a.length; i++) {
			primaryDiagonal = primaryDiagonal + a[i][i];
			secondaryDiagonal = secondaryDiagonal + a[i][a[i].length - 1 -i];
//			System.out.println(a[i][a[i].length - 1 -i]+" ");
//			System.out.println(a[i][i]+" ");

		}
		System.out.println(primaryDiagonal);
		System.out.println(secondaryDiagonal);
		System.out.println(secondaryDiagonal-primaryDiagonal);

	}
}
