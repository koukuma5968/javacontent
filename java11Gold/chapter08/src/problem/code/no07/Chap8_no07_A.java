package problem.code.no07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chap8_no07_A {
	public static void main(String[] args) {
		List<String> vehicle = Arrays.asList("train", "bicycle", "car");
		Stream<String> s = vehicle.stream();
		Optional<String> keys = s.collect(
				Collectors.maxBy((val,val2) -> val.compareTo(val2)));
		keys.stream().forEach(System.out::println);
	}
}
