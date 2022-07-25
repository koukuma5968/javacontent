package example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter8_05 {

	public static void main(String[] args) {
		Stream<String> st = Stream.of("c", "f", "a", "b", "e");
		List<String> list =  st.collect(Collectors.toList());
		for (String str : list) {
			System.out.println(str);
		}
	}
}
