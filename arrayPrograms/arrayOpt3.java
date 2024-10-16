package arrayPrograms;


//wap to sort the elements of the array in ascending order till
//kth elements and after that in descending order.

public class arrayOpt3 {
	public static void main(String[] args) {
		int[] a = { 8, 1, 5, 4, 9, 2, 6 };
		int k = 4;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (j < k) {
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				} else {
					if (a[j] < a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
}
