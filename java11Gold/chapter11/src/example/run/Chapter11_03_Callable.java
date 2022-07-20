package example.run;

import java.util.concurrent.Callable;

public class Chapter11_03_Callable implements Callable<Boolean> {
	private int index, time;
	public Chapter11_03_Callable(int index, int time) {
		this.index=index;this.time=time;
	}
	@Override
	public Boolean call() throws Exception {
		try {
			Thread.sleep(this.time);
			System.out.println(this.index);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
}
