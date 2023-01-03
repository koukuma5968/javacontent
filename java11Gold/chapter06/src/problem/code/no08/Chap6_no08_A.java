package problem.code.no08;

import java.util.Optional;

public class Chap6_no08_A {
	public static void main(String[] args) {
		Optional<Integer> a = Optional.of(100);
		Optional<Integer> b = a.map(price -> calc(price, 3));
		System.out.print(b.get());
	}

	private static Optional<Integer> calc(int price, int qty) {
		if (qty < 0) {
			return Optional.empty();
		}
		return Optional.of(price * qty);
	}
}
