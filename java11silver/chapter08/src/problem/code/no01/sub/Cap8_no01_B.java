package problem.code.no01.sub;

import problem.code.no01.Cap8_no1_Super;

public class Cap8_no01_B extends Cap8_no1_Super {

	Cap8_no01_B() {
		super("Cap8_no01_B");
	}
	public void sub_method() {
		System.out.println(super.def);
		super.protected_method();
		super.private_method();
	}
}
