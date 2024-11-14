package practice2;

public class Prime {
	public static void main(String[] args) {
		 int []	arr = {7,1,2,5,91,73};
		 for (int i =0;i<arr.length;i++) {
			 if(isPrime(arr[i])) {
				 System.out.println(arr[i]);
				 
			 }
		 }
		 
	}
	
	public static boolean isPrime(int n) {
		int count = 0;
		for (int i =1;i<=n; i++) {
			if (n%i==0) {
				count ++;
			}
		}
		return count== 2;
	}

}