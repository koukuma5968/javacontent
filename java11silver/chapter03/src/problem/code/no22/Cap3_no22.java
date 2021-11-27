package problem.code.no22;

public class Cap3_no22 {
	public static void main(String[] args) {
		String str = "capt123exam";
		int index = 5;
		if (Character.isAlphabetic(str.charAt(index))) {
			index = 0;
		} else if (Character.isDigit(str.charAt(index))) {
			index = 10;
		} else {
			++index;
		}
		if (str.endsWith("exam"))
			str = str.substring(0, index);
		System.out.println(str);
	}
}
