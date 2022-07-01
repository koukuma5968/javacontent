package example;

import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;

public class Chapter7_03 {

	public static void main(String[] args) {
		// Function<T,​R>を引数型をint型で指定されたもの
		IntFunction<String> intf = (i) -> {
			i++;
			return "戻り値：" + i;
		};
		System.out.println(intf.apply(5));
		// Function<T,​R>を引数型をdouble型、戻り値をlongで指定されたもの
		DoubleToLongFunction dtl = (d) -> {
			d++;
			return (long) d;

		};
		System.out.println(dtl.applyAsLong(3.5));
	}
}
