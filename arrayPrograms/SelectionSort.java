package arrayPrograms;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 24, 3, 18, 5, 17, 1 };
		System.out.println("before sorting");
		printArray(a);

		for (int i = 0; i < a.length; i++) {
			int min = i;// to store smallest element index; considering i'th will be smallest element
						// index of an array
			for (int j = i + 1; j < a.length; j++) {// "i+1" cause we starting comparing the element from the next to the
													// current smallest element position
				if (a[j] < a[min]) {// if next index value is smaller than current index value
					min = j;// we will stored the smallest values index in min
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}

		System.out.println("after sorting");
		printArray(a);

	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
