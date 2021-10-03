package problem.code.no08;

public class Cap4_no08_A {

	public static void main(String[] args) {
		char[][] charsA = {{'a','b','c','d'},{'A','B'}};
		char[][] charsB = {{'ｱ','ｲ','ｳ'},{'ア','イ'}};
		for (int i = 0; i < 2; i++) {
			System.out.print(charsA[i][i]);
			System.out.print(charsB[i][i]);
		}
	}
}
