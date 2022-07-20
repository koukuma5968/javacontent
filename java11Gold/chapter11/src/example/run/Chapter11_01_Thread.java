package example.run;

public class Chapter11_01_Thread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5); // 5ミリ秒スリープ
			System.out.println("Thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
