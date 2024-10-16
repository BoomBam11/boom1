/*
 * wap to display the pattern =>16 11 6 1 -4 1 6 11 16 
 *						 	  => 10 5 0 5 10
*/
package programs;

public class P4 {

	public static void myLogic(int n) {

		if (n > 0) {
			System.out.print(n + " ");
			myLogic(n - 5);//
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		myLogic(16);

	}

}
