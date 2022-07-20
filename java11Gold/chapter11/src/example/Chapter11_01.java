package example;

import example.run.Chapter11_01_Runnable;
import example.run.Chapter11_01_Thread;

public class Chapter11_01 {

	public static void main(String[] args) {
		Thread c11R = new Thread(new Chapter11_01_Runnable());
		c11R.start();
		Chapter11_01_Thread c11T = new Chapter11_01_Thread();
		c11T.start();
		System.out.println("Main");// スリープなし
	}
}
