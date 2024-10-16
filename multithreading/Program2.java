package multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class Data {

	String data = "orange";
	String path = "D:\\eclipse-workspace\\programing\\src\\multithreading\\output.txt";

	synchronized void printData() throws FileNotFoundException, InterruptedException {
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			Thread.sleep(1000);
			pw.write(ch);
			System.out.println("printing data " + data.charAt(i));
		}
		pw.flush();
	}

	synchronized void modifyData(String data) {
		this.data = data;
	}
}

class T1 extends Thread {

	Data ref;

	T1(Data ref) {
		this.ref = ref;
	}

	@Override
	public void run() {
		try {
			ref.printData();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}

}

class T2 extends Thread {

	Data ref;

	T2(Data ref) {
		this.ref = ref;
	}

	@Override
	public void run() {

		ref.modifyData("Kiwi");

	}

}

public class Program2 {
	public static void main(String[] args) throws InterruptedException {
		Data ref = new Data();
		T1 thread1 = new T1(ref);
		T2 thread2 = new T2(ref);
		thread1.start();
		thread2.start();
		Thread.sleep(9000);
		System.out.println(ref.data);
	}
}
