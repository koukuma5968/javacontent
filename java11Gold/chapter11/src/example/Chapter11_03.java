package example;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import example.run.Chapter11_03_Callable;

public class Chapter11_03 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i=0;i<5;i++) {
			Random r = new Random(10);
			Future<Boolean> futureResult = ex.submit(new Chapter11_03_Callable(i, r.nextInt(20)));
		}
		System.out.println("main");
		ex.shutdown();
	}
}
