package problem.code.no02;

import java.util.function.BiPredicate;

public class Chap5_no02_A {
	public static void main(String[] args) {
		BiPredicate<Integer, Long> bip = (z, x) -> z * x;
		BiPredicate<Integer> bip2 = (x) -> x / 4;;
		BiPredicate<Integer, Long> bip3 = (z, x) -> z > x;
		BiPredicate<Integer> bip4 = (x) -> x != 4;;
	}
}
