package problem.code.no06;

import java.util.function.UnaryOperator;

public class Chap7_no06_A {
	public static void main(String[] args) {
		UnaryOperator<String> u = (t) -> t + "Operator";
		u.apply("Unary");
		u.get();
		u.accept();
		u.add("Unary");
	}
}
