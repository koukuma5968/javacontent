package problem.code.no04;

import java.util.function.BiFunction;

public class Chap5_no04_A {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> bif = (a, b) -> a - b;
		BiFunction<Integer, String> bif2 = (a, b) -> a / b;
		BiFunction<Integer, Integer, String> bic3 = (a, b) -> Integer.toString(a + b);
		BiFunction<Integer, String> bid4 =  (a, b) -> Integer.toString(a / b);
	}
}
