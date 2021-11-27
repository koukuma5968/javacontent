package problem.code.no01;

public class Cap10_no01 {
	public static void main(String[] args) {
		try {
			int[] array = {1,2,3};
			array[3] = 10;
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception");
		}
	}
}
