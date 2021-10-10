package problem.code.no05;

public class Cap6_no05_A {

	public static void main(String[] args) {
		Cap6_no05_A.testA();
		new Cap6_no05_A().testB();
	}

	private static void testA() {
		testB();
	}
	public void testB() {
		new Cap6_no05_B().testA();
	}
}
