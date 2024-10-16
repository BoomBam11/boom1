package arrayPrograms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 18, 5, 72, 1, 9 };
		System.out.println("Before Sorting");
		printArray(a);
		for (int i = 0; i < a.length; i++) {// repeating the iteration and iteration will perform till size of array
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j + 1]) {//to print in descending ">" to "<"
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}	
		}
		System.out.println("Before Sorting");
		printArray(a);
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
