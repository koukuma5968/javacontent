package problem.code.no01;

import java.util.function.Supplier;

public class Cap9_no01 {
	void cp() {
		int i = 0;
		Supplier<Integer> sup = () -> i;
		i++;
		System.out.println(sup.get());
	}
}
