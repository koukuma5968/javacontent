package problem.code.no04;

import java.util.function.Consumer;

public class Chap7_no04_A {
	public static void main(String[] args) {
		Consumer<String> c = v -> System.out.println(v);
		c.accept("str");

		Consumer<String> c2 = s -> "c2" + s;
		System.out.println(c2.accept("val"));

		Consumer<String> c3 = () -> "c3";
		System.out.println(c3.accept());

		Consumer<String> c4 = () -> System.out.println("z");;
		c4.accept();

	}
}
