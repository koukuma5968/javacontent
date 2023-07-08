package problem.no02;

import java.util.Arrays;
import java.util.List;

public class Chap12_no02_A {
	public static void main(String[] args) {
		List<String> st = Arrays.asList("c", "5", "a", "A", "ｱ");
		st.parallelStream().forEach(v -> {
			try {
				Thread.sleep(500);
				System.out.println(v + ":" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
