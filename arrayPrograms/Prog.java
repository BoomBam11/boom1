package arrayPrograms;

public class Prog {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int evenCount = 0, oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		
		int evenIndex = 0, oddIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[evenIndex++] = arr[i];
			} else {
				odd[oddIndex++] = arr[i];
			}
		}

		for (int num : even) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int num : odd) {
			System.out.print(num + " ");
		}

	}
}