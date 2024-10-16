package programs;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start :");
		int first = sc.nextInt();
		System.out.println("Enter the end :");
		int last = sc.nextInt();

		table(first, last);
	}

	static void table(int first, int last) {
		for (int j = 1; j <= 10; j++) {
			for (int i = first; i <= last; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "	");
			}
			System.out.println();
		}
	}

	static void table1(int first, int last) {

		for (int j = 1; j <= 10; j++) {

			for (int i = first; i <= last; i++) {
				System.out.print(i+"*"+j+"="+j * i + " ");
			}
			System.out.println();

		}

	}

}
