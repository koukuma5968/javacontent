package problem.code.no06;

import java.util.List;

public class Chap8_no06_A {
	public void a() {
		List.of(1,2,3).forEach(x -> System.out.println(x));
	}
	public void b() {
		List.of(1,2,3).forEach(() -> System.out.println(x));
	}
	public void c() {
		List.of(1,2,3).forEach(() -> return 100);
	}
	public void d() {
		List.of(1,2,3).forEach((x) -> return x * 100);
	}
}
