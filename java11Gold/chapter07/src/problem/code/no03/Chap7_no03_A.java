package problem.code.no03;

import java.util.function.Consumer;

public class Chap7_no03_A {
	public static void main(String[] args) {
		Consumer<Integer> c = (num) -> System.out.println(num);
		c.accept(10);
		c.get();
		c.aplly(10);
		c.add(20);
	}
}
