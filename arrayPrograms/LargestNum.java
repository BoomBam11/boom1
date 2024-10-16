package arrayPrograms;

public class LargestNum {

	public static void main(String[] args) {
		int[] a = { 6, 18, 23, 5, 10 };
		int largest = Integer.MIN_VALUE;//we can also add a[0] it can be smallest value but not good practice.
		for (int i = 0; i < a.length; i++) {// we can also start with i =1 :anis note first check it 
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}

}
