package example;

import example.run.Chapter11_08_Sub_synchronized;
import example.run.Chapter11_08_Thread;

public class Chapter11_08 {

	public static void main(String[] args) {
		Chapter11_08_Sub_synchronized sub = new Chapter11_08_Sub_synchronized();
		new Chapter11_08_Thread(sub, "First").start();
		new Chapter11_08_Thread(sub, "Second").start();
		new Chapter11_08_Thread(sub ,"Third").start();
	}
}
