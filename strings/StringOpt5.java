package strings;
//swap two string using third var
public class StringOpt5 {
	public static void main(String[] args) {
		String s1="anis";
		String s2="max";
		
		String tempString = s1;
		s1= s2;
		s2=tempString;
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
