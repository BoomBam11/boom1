package arrayPrograms;

public class ArrayOperation {

	public static void main(String[] args) {
		int[] a = { 5, 9, 12, 16, 25 };
		int k = 6;

		int decrementCount = 0;
//		for (int i = 0; i < a.length; i++) {
//			while (a[i] % k != 0) {
//				a[i] = a[i] - 1;
//				decrementCount = decrementCount + 1;
//
//			}
//
//		}
//		System.out.println(decrementCount);
		
		for (int i = 0; i < a.length; i++) {
			decrementCount = decrementCount+(a[i]%k);
		}
		System.out.println(decrementCount);
		
		
		

	}

}
