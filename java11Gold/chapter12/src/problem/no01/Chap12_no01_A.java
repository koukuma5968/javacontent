package problem.no01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Chap12_no01_A {
	List<String> list = Arrays.asList("A","B","C","D");
	public void a() {
		ParallelStream<String> stream = list.parallelStream();
	}
	public void b() {
		ParallelStream<String> stream = list.getParallelStream();
	}
	public void c() {
		Stream<String> stream = list.getParallelStream();
	}
	public void d() {
		Stream<String> stream = list.parallelStream();
	}
}
