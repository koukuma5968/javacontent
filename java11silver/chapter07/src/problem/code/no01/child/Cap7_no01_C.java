package problem.code.no01.child;

public final class Cap7_no01_C {
	public void test() {
		new Cap7_no01_A_sub();
	}
	private class Cap7_no01_C_sub {
		public void test() {
			new Cap7_no01_A_sub();
		}
	}
}
