package problem.code.no12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Chap6_no12_A {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,5,2,6,4);
		Optional<Integer> b = a.stream().max((i, j) -> j - i);
		b.ifPresent(System.out::print);
	}
}
