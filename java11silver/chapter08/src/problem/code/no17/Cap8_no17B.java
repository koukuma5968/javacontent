package problem.code.no17;

public class Cap8_no17B extends Cap8_no17A {
	private void print(String str) {
		System.out.print(str);
	}
	public void b(String str) {
		print(str);
	}
	public static void main(String[] args) {
		Cap8_no17B cpb = new Cap8_no17B();
		cpb.a("3");
		cpb.b("5");
	}
}
