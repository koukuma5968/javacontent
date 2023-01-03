package problem.code.no03;

import java.util.function.BiConsumer;

public class Chap5_no03_A {
	public static void main(String[] args) {
		BiConsumer<Integer, Long> bic = (i, l) -> i + l;
		BiConsumer<Integer, Long> bic2 = (i, l) -> System.out.println(i * l);;
		BiConsumer<Integer, Long> bic3 = (i) -> i / 4;;
		BiConsumer<Integer, Long> bic4 = (l) -> System.out.println(l - 2);;

	}
}
