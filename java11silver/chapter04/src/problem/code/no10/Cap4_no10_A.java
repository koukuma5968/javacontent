package problem.code.no10;

public class Cap4_no10_A {

	public static void main(String[] args) {
		String[][] strsA = {{"A","B"},null,{"D","F"}};
		String[] strB = strsA[0].clone();
		for (String str : strB) {
			System.out.print(str);
		}
	}
}
