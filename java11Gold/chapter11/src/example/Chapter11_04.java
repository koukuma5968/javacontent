package example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Chapter11_04 {

	public static void main(String[] args) {
	    CyclicBarrier barrier = new CyclicBarrier(3); // バリアの作成
        Runnable r = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                System.out.print(threadName + ": s=");
                System.out.println(System.currentTimeMillis());
                barrier.await(); // バリアで待機
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.print(threadName + ": e=");
            System.out.println(System.currentTimeMillis());
        };

        for (int i=0; i<6; i++) {
            try {
				Thread.sleep(500);
	            new Thread(r).start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
	}
}
