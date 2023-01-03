package problem.code.no02;

import java.util.function.Supplier;

public class Chap7_no02_A {
	public static void main(String[] args) {
		Supplier<String> s = (val) -> System.out.println(val);
		s.get("str");

		Supplier<String> s2 = (val) -> "s2" + val;
		System.out.println(s2.get());

		Supplier<String> s3 = () -> "s3";
		System.out.println(s3.get());

		Supplier<String> s4 = () -> "s4";
		System.out.println(s4.apply());

	}
}
