package problem.code.no01;

public class Cap7_no01_B {
	public void test() {
		new Cap7_no01_A_sub();
	}
	protected class Cap7_no01_B_sub {
		public void test() {
			new Cap7_no01_A_sub();
		}
	}
}
