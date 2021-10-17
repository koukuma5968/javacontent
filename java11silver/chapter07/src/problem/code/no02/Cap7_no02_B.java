package problem.code.no02;

import problem.code.no02.Cap7_no02_B.Cap7_no02_B_sub;

public class Cap7_no02_B {
	protected class Cap7_no02_B_sub {}
	private class Cap7_no02_C_sub {
		public void test() {
			new Cap7_no02_B_sub();
		}
	}

}
class Cap7_no02_B_inner {
	public void test() {
		new Cap7_no02_B_sub();
	}
}