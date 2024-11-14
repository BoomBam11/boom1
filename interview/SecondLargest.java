package practice2;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 6, 18, 23, 5, 10 ,23};
		int largest = Integer.MIN_VALUE;
		int secLarge = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
			//18>6 == true  // 23>18 == true // 5> 23 == false
				secLarge = largest;//it will store the second large value secLarge = //6 //18
				largest = a[i];//18 //23
			} else if (a[i] > secLarge && a[i] != largest) {///18>6 && 18!=       //a[i] != largest for duplicate value 
				secLarge = a[i];
			}
		}
//		System.out.println(largest);
		System.out.println(secLarge);

	}

}

