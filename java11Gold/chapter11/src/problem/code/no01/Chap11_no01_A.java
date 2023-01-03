package problem.code.no01;

public class Chap11_no01_A {
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public synchronized void start() {
				super.start();
				System.out.println("start");
			}
			@Override
			public void run() {
				super.run();
				System.out.println("run");
			}
		};
		t.start();;
	}
}
