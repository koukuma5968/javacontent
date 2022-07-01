package example;

import java.util.Optional;
import java.util.stream.Stream;

public class Chapter8_02 {

	public static void main(String[] args) {
		// 最初の要素を返す
		Stream<String> st = Stream.of("c", "f", "a", "b", "e");
		Optional<String> ff = st.findFirst();
		System.out.println(ff.get());
		// いずれかの要素を返す
		st = Stream.of("c", "f", "a", "b", "e");
		Optional<String> fa = st.findAny();
		System.out.println(fa.get());
		// 条件に一致する要素が含まれるかを返す
		st = Stream.of("c", "f", "a", "b", "e");
		boolean am = st.anyMatch(val -> "e".equals(val));
		System.out.println(am);
		// すべての要素が条件に一致するかを返す
		st = Stream.of("monday", "tuesday", "wednesday");
		boolean alm = st.allMatch(val -> val.contains("day"));
		System.out.println(alm);
		// 条件に一致する要素が一つもないかどうかを返す
		st = Stream.of("monday", "tuesday", "wednesday");
		boolean nm = st.noneMatch(val -> val.length() > 6);
		System.out.println(nm);
	}
}
