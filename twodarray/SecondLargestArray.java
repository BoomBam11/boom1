package twodarray;

public class SecondLargestArray {
	public static void main(String[] args) {
		int[][] a = { { 11, 22, 33 }, 
					  { 44, 55, 66 }, 
					  { 77, 88, 99 } };
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if(a[i][j]>largest) {
					seclargest=largest;
					largest=a[i][j];
				}
				if(a[i][j]>seclargest && a[i][j]!=largest) {
					seclargest=a[i][j];
				}
				
			}
		}
		System.out.println(largest);
		System.out.println(seclargest);
			
	}
}
