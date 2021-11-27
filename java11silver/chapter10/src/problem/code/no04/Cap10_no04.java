package problem.code.no04;

public class Cap10_no04 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toUpperCase());
			System.out.println("end");
		} finally {
			System.out.println("finish");
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}
}
