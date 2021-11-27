package problem.code.no09;

public class Cap5_no09_A {
	private char a;
	private int b = 1;
	String test(char a, int b) {
		return a + ", " + b;
	}
	public static void main(String[] args) {
		Cap5_no09_A cp = new Cap5_no09_A();
		System.out.println(cp.test('A'));
	}
}
