package example;

import java.util.stream.Stream;

public class Chapter8_03 {

	public static void main(String[] args) {
		// 最初の要素を返す
		Stream<String> st = Stream.of("c", "f", "a", "b", "e");
		int ff = st.filter(w -> w.getColor() == RED)
                .mapToInt(w -> w.getWeight())
                .sum();;
	}
}
