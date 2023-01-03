package problem.code.no01;

import java.util.function.Supplier;

public class Chap7_no01_A {
	public static void main(String[] args) {
		Supplier<String> s = () -> "s";
		System.out.println(s.get());
		System.out.println(s.set("s"));
		System.out.println(s.put("b"));
		System.out.println(s.add("c"));
	}
}
