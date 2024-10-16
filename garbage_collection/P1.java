package garbage_collection;

public class P1 {
	int i= 4;
	public static void main(String[] args) {
		System.out.println(new P1());//->Anonymous Object
		P1 ref = new P1();
		ref = null;//nullify object reference
		System.out.println(ref);//ref.i
		P1 ref1 = new P1();
		P1 ref2 = new P1();
		System.out.println(ref1);
		System.out.println(ref2);
		ref1=ref2;//assigning one ref variable to another ref variable
		System.out.println(ref1);
		System.gc();
	}
	@Override
	public void finalize() {
		System.out.println("removed unused garbage collection");
	}

}
