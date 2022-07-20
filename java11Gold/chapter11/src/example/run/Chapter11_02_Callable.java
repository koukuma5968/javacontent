package example.run;

import java.util.concurrent.Callable;

public class Chapter11_02_Callable implements Callable<String> {
	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(10); // 10ミリ秒スリープ
			System.out.println("Runnable");
			return "RunnableRet";
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
