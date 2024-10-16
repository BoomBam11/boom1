package programs;

public class Swapping {
	public static void main(String[] args) {
		
//		with using third
		int a = 5, b = 7;
		int temp = a; // temp =5
		a = b;// a=7
		b = temp;// b=5
		System.out.println(a + " " + b);

//		without using third
		
		int first = 5, second = 7;	
		
		first = first+second;
		second=first-second;
		first=first-second;
		
		System.out.println(first + " " + second);

	}
}
