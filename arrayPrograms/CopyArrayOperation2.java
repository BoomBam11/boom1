package arrayPrograms;

import java.util.Arrays;

public class CopyArrayOperation2 {

	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 0, 1, 3, 4, 1, 0, 2 };
		System.out.println("before");
		printArray(a);

		int[] b = new int[a.length];
		
		//using for loop
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		
		//using Arrays.copyOf(array, size) method
		int[] c=Arrays.copyOf(a, a.length);
		
		
		//using arrayCopy(SrcArry,srcPOs,DestArray,DestPOs,Array_size)
		int[] d=new int [a.length];
		System.arraycopy(a, 0, d, 0, a.length);
		
		//using clone() method
		int[] e = a.clone();
//		printArray(a);
		printArray(b);
//		printArray(c);
//		printArray(d);
//		printArray(e);

		
		int goodInteger=0;
		int badInteger=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (a[i]==b[i]) {
				goodInteger=goodInteger+b[i];
			}else {
				badInteger=badInteger+b[i];
			}

		}
		System.out.println(goodInteger - badInteger);

		System.out.println("after");
		printArray(a);

	}

	static void printArray(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
