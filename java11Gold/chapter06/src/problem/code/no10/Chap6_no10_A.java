package problem.code.no10;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chap6_no10_A {
	int[] array = {1,2,3,4,5,};
	public void a() {
		Stream<Integer> stream = array.stream();
	}
	public void b() {
		Stream<Integer> stream = Arrays.stream(array);
	}
	public void c() {
		IntStream stream = Arrays.stream(array);
	}
	public void d() {
		IntStream stream = array.stream();
	}
}
