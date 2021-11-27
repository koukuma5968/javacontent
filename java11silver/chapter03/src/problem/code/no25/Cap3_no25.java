package problem.code.no25;

public class Cap3_no25 {
	public static void main(String[] args) {
		String str = "case2";
		int i = 0;
		switch (str) {
			case "case1":
				i++;
			case "case2":
				i++;
			case "case3":
				i++;
				break;
			default:
				i = 0;
		}
		System.out.println(str.substring(i));
	}
}
