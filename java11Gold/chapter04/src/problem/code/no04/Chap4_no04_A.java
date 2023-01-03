package problem.code.no04;

import java.util.ArrayList;
import java.util.List;

public class Chap4_no04_A {
	public static void main(String[] args) {
		List<? extends Number> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		for (Number n : l) {
			System.out.println(n);
		}
	}
}
