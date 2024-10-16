package arrayPrograms;

public class MaxNumInArray {
	public static void main(String[] args) {
//		int[] a = { 3, 77, 343, 456 };

		int[] a= {37,823,122,2322,6017};

		int k = 1;// 2//3

		int maxCount = 0;
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int temp = a[i];
			while (a[i] != 0) {
				int digit = a[i] % 10;
				if (digit == k) {
					count++;
				}
				if (count > maxCount) {
					maxCount = count;
					res = temp;
				}

				a[i] = a[i] / 10;

			}
		}
		System.out.println(res);

	}
}
