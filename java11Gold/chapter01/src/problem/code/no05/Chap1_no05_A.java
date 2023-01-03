package problem.code.no05;

public class Chap1_no05_A {
	private String val;
	public Chap1_no05_I msg(String mes) {
		class X implements Chap1_no05_I {
			@Override
			public void print() {
				System.out.println(val + mes);
			}
		}
		val = "Open, ";
		mes = "jdk";
		return new X();
	}
}
