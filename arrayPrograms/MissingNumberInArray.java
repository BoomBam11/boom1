/*
\ * WAP to find the missing number from the array
size of array is n
elements of array is 0-n
Find the missing element.

Input - 
n = 9
arr = [8,3,4,1,2,6,0,7,9]

Output - 5 
*/

package arrayPrograms;

public class MissingNumberInArray {
	public static void main(String[] args) {

		int[] a = { 8, 3, 4, 1, 2, 6, 0, 7, 9 };

		int n = a.length;

		for (int i = 0; i < n; i++) {

			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[j] == i) {
//					System.out.println(i+" found at "+j);
					break;
				} else {
					count++;
//					System.out.println("count  "+count);
					if (count == n) {
						System.out.println(i + " not found ");
					}
				}

			}

		}

		int indexSum = 0, elementSum = 0, missingElement = 0;

		for (int k = 0; k < a.length; k++) {

			elementSum = elementSum + a[k];

		}

		for (int k = 0; k <= n; k++) {

			indexSum = indexSum + k;

		}

		System.out.println(indexSum - elementSum);

	}
}
