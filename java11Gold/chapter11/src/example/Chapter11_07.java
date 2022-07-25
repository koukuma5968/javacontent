package example;

import example.run.Chapter11_07_Sub;
import example.run.Chapter11_07_Thread;

public class Chapter11_07 {

	public static void main(String[] args) {
		Chapter11_07_Sub sub = new Chapter11_07_Sub();
		new Chapter11_07_Thread(sub, "First").start();
		new Chapter11_07_Thread(sub, "Second").start();
		new Chapter11_07_Thread(sub ,"Third").start();
	}
}
