package example;

import java.util.Arrays;
import java.util.List;

public class Chapter12_01 {

	public static void main(String[] args) {
		List<String> st = Arrays.asList("c", "5", "a", "A", "ｱ");
		// 順次ストリーム
		st.stream().forEach(v -> {
			try {
				Thread.sleep(500);
				System.out.println(v + ":" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		System.out.println();
		// 並列ストリーム
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
