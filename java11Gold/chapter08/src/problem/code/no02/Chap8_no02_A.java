package problem.code.no02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Chap8_no02_A {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<String> res
		= list.stream().map(n -> String.valueOf(n));

	}
}
