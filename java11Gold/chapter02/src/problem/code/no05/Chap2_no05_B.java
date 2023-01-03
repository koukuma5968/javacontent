package problem.code.no05;

import java.io.Closeable;

public class Chap2_no05_B implements Closeable {
	@Override
	public void close() {
		System.out.println("B");
	}
}
