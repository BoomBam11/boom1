//How to create an array?
//1. using array literal
//
//datatype[] variable = {val1, val2, val3,....};
//
//2. using new keyword
//
//datatype[] variable = new datatype[size]; 



package arrayPrograms;

public class PrintArrayUsingLiterals {
	//array is a continuous block of memory 
	public static void main(String[] args) {
		int[] a = {10,20,30};// array is a concept array will be stored in object 
		for (int i = 0; i < a.length; i++) { // one more block is created for length is a variable == it will store the count of array
			System.out.println(a[i]);
		}
	}

}
