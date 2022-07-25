package example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter8_06 {

	public static void main(String[] args) {
		Stream<String> st = Stream.of("c", "f", "A", "b", "E");
		Map<Object, List<String>> ml =  st.collect(Collectors.groupingBy(v -> {
			if (v.matches("^[A-Z]+$")) return "大文字";
			return "小文字";
		}));
		Set<Entry<Object, List<String>>> mapset =  ml.entrySet();
		Iterator<Entry<Object, List<String>>> it = mapset.iterator();
		while(it.hasNext()) {
			Entry<Object, List<String>> en = it.next();
			System.out.print("key=" + en.getKey());
			System.out.print(",");
			for (String s : en.getValue()) {
				System.out.print("value=" + s);
				System.out.print(",");
			}
			System.out.println();
		}
	}
}
