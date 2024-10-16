//WAP print ALL THE 500 TO 1
package programs;

public class P3 {

	
	public static int method(int n) {
		if(n>1) { //Base Condition
			System.out.println(n--);
			return method(n);
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(method(500));

	}

}
