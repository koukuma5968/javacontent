package problem.code.no04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Chap11_no04_A {
	public static void main(String[] args) {
		ScheduledExecutorService se = Executors.newScheduledThreadPool(1);
		se.schedule(() -> {
			System.out.println("schedule");
		}, 1, TimeUnit.SECONDS);
		se.schedule(() -> {
			System.out.println("schedule");
		}, TimeUnit.MILLISECONDS);
		se.execute(() -> {
			System.out.println("schedule");
		}, 1, TimeUnit.SECONDS);
		se.execute(() -> {
			System.out.println("schedule");
		});
	}
}
