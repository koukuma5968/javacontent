package problem.code.no03;

public class Cap10_no3 {
	public static void main(String[] args) {
		try {
			exceptionA();
			exceptionB();
		} catch (Cap10_no3_A e) {
			System.out.println("exA");
		} catch (Cap10_no3_B e) {
			System.out.println("exB");
		}
	}

	private static void exceptionA() throws Cap10_no3_A {
		throw new Cap10_no3_A();
	}

	private static void exceptionB() throws Cap10_no3_B {
		throw new Cap10_no3_B();
	}

}
