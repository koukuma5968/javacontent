package problem.code.no05;

import java.util.function.Predicate;

public class Chap7_no05_A {
	public static void main(String[] args) {
		Predicate<Long> p = (t) -> t != 1L;
		p.test(2L);
		p.and(p);
		p.negate();
		p.or(p);

	}
}
