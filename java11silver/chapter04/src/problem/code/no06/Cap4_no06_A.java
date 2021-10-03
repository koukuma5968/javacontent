package problem.code.no06;

public class Cap4_no06_A {

	public static void main(String[] args) {
		String[] strs = {};
		char c = 'a';
		strs = new String[2];
		for (String str : strs) {
			str = String.valueOf(c++);
		}
		System.out.println(strs[0]);
	}
}
