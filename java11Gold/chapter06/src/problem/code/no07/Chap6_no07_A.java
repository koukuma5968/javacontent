package problem.code.no07;

import java.util.Optional;

public class Chap6_no07_A {
	public static void main(String[] args) {
		Optional<String> smp = Optional.of("abcde");
		Optional<String> res = smp.map(str -> str.toUpperCase());
		System.out.println(smp.get());
		System.out.println(res.get());
	}
}
