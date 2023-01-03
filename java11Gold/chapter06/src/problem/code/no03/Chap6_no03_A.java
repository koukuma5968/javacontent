package problem.code.no03;

import java.util.Optional;

public class Chap6_no03_A {
	public static void main(String[] args) {
		Optional<String> smp = Optional.of("A");
		System.out.print(smp.orElse("B"));
	}
}
