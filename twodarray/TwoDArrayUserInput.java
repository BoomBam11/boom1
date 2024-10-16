package twodarray;

import java.util.Scanner;

public class TwoDArrayUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of 2d array:");
		int outer = sc.nextInt();
		System.out.println("enter the size of 1d array:");
		int inner = sc.nextInt();

		int[][] a = new int[outer][inner];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("enter the value of index " + i + " of " + j);
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);

			}
		}

	}

}
