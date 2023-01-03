package problem.code.no02;

import java.util.Optional;

public class Chap6_no02_A {
	public static void main(String[] args) {
		Optional<String> smp = Optional.ofNullable(null);
		System.out.print(smp.get());
	}
}
