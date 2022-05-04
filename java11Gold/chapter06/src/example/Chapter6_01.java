package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Chapter6_01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");list.add("b");list.add("c");
		Stream<String> ls = list.stream();

		Stream<String> s = Stream.of("d","e","f");
		Stream<Integer> es = Stream.empty();

	}
}
