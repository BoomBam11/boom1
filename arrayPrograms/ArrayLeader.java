package arrayPrograms;

public class ArrayLeader {
	public static void main(String[] args) {
		int[] a = { 8, 7, 4, 3, 5, 2 };

		for (int i = 0; i < a.length; i++) {//selecting one element
			boolean isLeader = true;
			for (int j = i + 1; j < a.length; j++) {//to compare rest of the element with selected element
				if (a[j] > a[i]) {//a[i] is selected element
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.print(a[i] + " ");
			}
		}
//		

	}
}
