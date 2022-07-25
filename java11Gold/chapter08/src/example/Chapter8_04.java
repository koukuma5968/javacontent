package example;

import java.util.stream.Stream;

public class Chapter8_04 {

	public static void main(String[] args) {
		Stream<String> st = Stream.of("c", "f", "a", "b", "e");
		System.out.println("昇順");
		st.sorted().forEach(v -> System.out.println("ascendingm=" + v));
		st = Stream.of("c", "f", "a", "b", "e");
		System.out.println("降順");
		st.sorted((v1, v2) -> v2.compareTo(v1)).forEach(v -> System.out.println("ascendingm=" + v));
	}
}
