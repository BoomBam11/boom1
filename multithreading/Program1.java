package multithreading;

class A {
	
}

class Program1 extends A implements Runnable{

	@Override
	public void run() {
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		Program1 ref = new Program1();
		Thread ref1 = new Thread(ref);
		Thread ref2 = new Thread(ref);
		ref1.start();
		ref2.start();
			
	}
		
}
