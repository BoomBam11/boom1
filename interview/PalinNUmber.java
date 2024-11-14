package practice2;

public class PalinNUmber {
	

	//WAP to display the reverse value.
		public static void main(String[] args) {
			int n=-121;
			int rev=0 ,temp =n;
			while(n!=0)//123!==0
			{
				int digit=n%10; //123%10
				rev=(rev*10)+digit;//0*10+3
				n=n/10;
				
			}
			if(temp == rev) {
				System.out.println("it is Palindor");
			}else {
				System.out.println("it is not Palindor");
			}
			
			
			
			
			System.out.println(rev);
		
		}

	}
