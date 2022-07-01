package example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chapter7_02 {

	public static void main(String[] args) {
		// 引数の型を指定し、boolean型を返す関数
		Predicate<Integer> p = i -> 10 > i;
		System.out.println(p.test(5));

		// 引数の型を指定し、戻り値を持たない関数
		Consumer<String> c = System.out::println;
		c.accept("Consumer");

		// 引数,戻り値の型を指定する関数
		Function<Integer, String> f = i -> String.valueOf(i.intValue());
		System.out.println(f.apply(10));

		// 戻り値の型を指定し、引数を持たない関数
		Supplier<String> s = () -> "Supplier";
		System.out.println(s.get());
	}
}
