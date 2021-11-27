package problem.code.no05;

public class Cap10_no05 {
	public static void main(String[] args) {
		System.out.println(add(2147483647));
	}

	public static int add(long num) {
		int ret = 0;
		try {
			ret = Integer.valueOf(String.valueOf(++num));
		} catch (NumberFormatException e) {
			return -1;
		} finally {
			System.out.println(9);
		}
		return ret;
	}
}
