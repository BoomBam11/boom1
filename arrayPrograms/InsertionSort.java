package arrayPrograms;

//in insertion sorting we do not perform swapping we perform shifting.
public class InsertionSort {
	public static void main(String[] args) {

		int[] a = { 29, 4, 15, 7, 54 };

		for (int i = 1; i < a.length; i++) {// i = 1 cause if we select as 0 to compare with previous their is nothing
											// to compare;
			int temp = a[i];// store the selected element
			int j = i;
			while (j > 0 && a[j - 1] > temp) {// a[j-1] it is a previous element if it is greater than selected,|| we use temp instead of a[j] cause a[j] is override in every shifting iteration
				a[j] = a[j - 1];// shifting previous element to the selected element //In Insertion Sort, greater values are shifted to the right
				j--;
			}
			a[j] = temp;//// Insert the current element into its correct position means in first
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}