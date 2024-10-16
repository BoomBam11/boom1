package strings;


final class Student{
	private final int rollNo;
	final private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name ;
	}
}


public class MakeClassImmutable {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Anis");
		System.out.println(s1);
		

	}

}
