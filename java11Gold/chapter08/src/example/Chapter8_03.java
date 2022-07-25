package example;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chapter8_03 {

	public static void main(String[] args) {
		Stream<String> st = Stream.of("c", "f", "a", "b", "e");
		// count()
		long count = st.count();
		System.out.println("count=" + count);
		 st = Stream.of("c", "f", "a", "b", "e");
		// max()
		Optional<String> max = st.max((v1, v2) -> v1.compareTo(v2));
		System.out.println("max=" + max.get());
		 st = Stream.of("c", "f", "a", "b", "e");
		// min()
		Optional<String> min = st.min((v1, v2) -> v1.compareTo(v2));
		System.out.println("min=" + min.get());
		IntStream is = IntStream.of(11, 25, 53, 2, 37, 18);
		// average()
		OptionalDouble average = is.average();
		System.out.println("average=" + average.getAsDouble());
		is = IntStream.of(11, 25, 53, 2, 37, 18);
		// sum()
		int sum = is.sum();
		System.out.println("sum=" + sum);
	}
}
