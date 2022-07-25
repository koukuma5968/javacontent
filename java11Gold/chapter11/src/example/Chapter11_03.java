package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example.run.Chapter11_03_Callable;

public class Chapter11_03 {

	public static void main(String[] args) {
		Collection<Callable<Boolean>> calls = new ArrayList<Callable<Boolean>>();
		for (int i=0;i<5;i++) {
			Random r = new Random(10);
			Chapter11_03_Callable call = new Chapter11_03_Callable(i, r.nextInt(20));
			calls.add(call);
		}
		ExecutorService ex = Executors.newFixedThreadPool(5);
		try {
			ex.invokeAll(calls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex.shutdown();
	}
}
