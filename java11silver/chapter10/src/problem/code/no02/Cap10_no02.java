package problem.code.no02;

public class Cap10_no02 {
	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("0");
			}
		} catch (NullPointerException e) {
			System.out.println("null");
		} finally {
			System.out.println("finish");
		}
	}
}
