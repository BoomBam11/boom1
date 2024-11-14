package practice2;

public class WithoutThird {

	public static void main(String[] args) {
		String s1 = "anis";
		String s2 = "max";
		System.out.println("before swapping");
		System.out.println(s1);
		System.out.println(s2);

		s1 = s1.concat(s2);

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("after swapping");
		System.out.println(s1);
		System.out.println(s2);

	}

}