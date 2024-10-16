package arrayPrograms;

public class UniqueArrayElementsPrint {
	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 4, 6, 8 };
		boolean[] printed = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
//			System.out.print(printed[i]+" ");
			if (printed[i]) {
				continue;
			}

//			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
//					count++;
					printed[j] = true;
				}
			}
//			if(count==1) {
//				System.out.println(a[i]);
//			}
			System.out.println(a[i]); // Print the element at least once

		}
	}
}
