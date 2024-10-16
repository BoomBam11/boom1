package twodarray;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of 2d array");
		int outer = sc.nextInt();
		int[][] a = new int[outer][];

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the " + i + " inner array size");
			int inner = sc.nextInt();
			a[i] = new int[inner];
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("enter the value of " + i + " array " + j);
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
