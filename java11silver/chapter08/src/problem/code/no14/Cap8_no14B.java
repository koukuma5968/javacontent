package problem.code.no14;

public class Cap8_no14B extends Cap8_no14A {
	@Override
	void test(int i) {
		System.out.println(10);
	}
	public static void main (String[] args) {
		Cap8_no14A cpa = new Cap8_no14B();
		cpa.test();
	}
}
