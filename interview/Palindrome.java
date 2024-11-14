package practice2;


public class Palindrome {
	public static void main(String[] args) {
		String str="nitin";
		String rev="";
//		String rev=new String();
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
//		System.out.println(rev);
		
		if(str.equals(rev) )
		{
			System.out.println("Palindrome");
		}
		else	
		{
			System.out.println("Not palindrome");
		}
		
		
		
	}
}

