package problem.code.no01;

import java.util.function.Predicate;

public class Chap5_no01_A {
	public static void main(String[] args) {
		Predicate<String> p1 = a -> a.equals("hello");
		Predicate<String> p2 = a -> a.equals("world");
		System.out.println(p1.or(p2).test("hello"));
	}
}
