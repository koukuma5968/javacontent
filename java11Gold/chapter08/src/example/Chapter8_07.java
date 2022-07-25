package example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter8_07 {

	public static void main(String[] args) {
		Stream<String> st = Stream.of("c", "5", "a", "A", "ｱ");
		Map<Boolean, List<String>> ml =  st.collect(Collectors.partitioningBy(v -> {
			return v.matches("^[A-Za-z]+$");
		}));
		Set<Entry<Boolean, List<String>>> mapset =  ml.entrySet();
		Iterator<Entry<Boolean, List<String>>> it = mapset.iterator();
		while(it.hasNext()) {
			Entry<Boolean, List<String>> en = it.next();
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
