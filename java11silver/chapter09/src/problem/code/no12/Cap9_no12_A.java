package problem.code.no12;

import java.util.function.Function;

public class Cap9_no12_A {
	public static void main(String[] args) {
		Function<String, Integer> m = (str) -> {
			return Integer.parseInt(str);
		};
		System.out.println(m.apply("lam"));
	}
}
