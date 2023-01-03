package problem.code.no03;

import java.util.Arrays;
import java.util.List;

public class Chap8_no03_A {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer res
		= list.stream().reduce(0, (a, b) -> a + b);
	}
}
