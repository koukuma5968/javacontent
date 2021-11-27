package problem.code.no06;

public class Cap10_no06 {
	public static void main(String[] args) {
		int rs = print();
		System.out.println(rs);
	}

	public static int print() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			return -1;
		} finally {
			return 100;
		}
	}
}
