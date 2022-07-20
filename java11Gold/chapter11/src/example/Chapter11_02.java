package example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import example.run.Chapter11_02_Callable;

public class Chapter11_02 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<String> futureResult = ex.submit(new Chapter11_02_Callable());
		try {
			for (int i=0;i<5;i++) {
				Thread.sleep(3); // 3ミリ秒スリープを5回実行
				System.out.println("main"+ i);
			}
			System.out.println(futureResult.get());
			ex.shutdown();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
