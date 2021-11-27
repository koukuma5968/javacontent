package problem.code.no09;

public class Cap9_no09_A {
	public static void main(String[] args) {
		String str = "A";
		Function lam = (str) -> {
			System.out.println(str);
		};
		lam.test("B");
	}
	interface Function {
		void test(String str);
	}
}
