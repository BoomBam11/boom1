package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargeDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
//		int largest = 0 ; //in largest use smallest value // 0 to compare all largest value to the smallest 0
//		
//		while(n!=0) {
//			int digit = n%10;
//			
//			if(digit>largest) {
//				largest = digit;
//			}
//			n=n/10;
//			
//		}
//		System.out.println(largest);
		
		
		int smallest = 9 ; //in smallest use Largest value
		
		while(n!=0) {
			int digit = n%10;
			if(digit<smallest) {
				smallest = digit;
			}
			n=n/10;
			
		}
		System.out.println(smallest);
		
		
		
		
		
		
		
//		ArrayList al = new ArrayList();
//
//		while (n != 0) {
//			int digit = n % 10;
//			
//			al.add(digit);
//
//			n = n / 10;
//
//		}
//
//		Collections.sort(al.reversed());
//
////		for (Object object : al) {
////			System.out.println(object);
////		}
//
//		System.out.println("largest " + al.get(0));

	}
	
	
	
	

}
