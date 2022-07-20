package example.run;

public class Chapter11_01_Runnable implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(10); // 10ミリ秒スリープ
			System.out.println("Runnable");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
