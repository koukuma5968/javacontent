package problem.code.no27;

public class Cap3_no27 {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (String str : arr) {
			System.out.println(str + " ");
			if (str.equals("C")) {
				System.out.println("continue ");
				continue;
			}
			System.out.println("break");
			break;
		}
	}
}
