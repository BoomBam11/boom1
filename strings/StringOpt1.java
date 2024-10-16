package strings;

public class StringOpt1 {

	static String s1 = "apple";
	
	static String s3 = new String("apple");
	
	public static void main(String[] args) {
		
//		String s1 = "apple";

		String s2 = "apple";//String Constant Pool
		
//		s2 = "hi";

		System.out.println(s1 == s2);

//		String s3 = new String("apple");
		
		String s4 = new String("apple");//Heap Area As Well As String Constant Pool

		String s5 = new String("apple");//Only In Heap Area Cause data is already present inside String Constant Pool

		
		System.out.println(s3 == s4);

		System.out.println(s1 == s3.intern());//=> s3.intern() its calling the data inside String Constant pool

	}

}
