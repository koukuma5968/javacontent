package problem.code.no05;

public class Chap2_no05_M {
	public static void main(String[] args) {
		Chap2_no05_A a = new Chap2_no05_A();
		try {
			Chap2_no05_C c = new Chap2_no05_C();
			try (a;
				Chap2_no05_B b = new Chap2_no05_B();
				c;) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
