package problem.code.no26;

public class Cap3_no26 {
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			System.out.print(x++);
		}
		System.out.println();

		for (int a = 0; a < 10;) {
			System.out.print(a);
			a++;
		}
		System.out.println();

		int b = 0;
		for (; b < 10;) {
			System.out.print(++b);
		}
		System.out.println();

		for (int d = 0; d < 10; d++) {
			System.out.print(d++);
		}
		System.out.println();

		int c = 0;
		for (;;c++) {
			System.out.print(c);
			if (c==10) break;
		}
		System.out.println();

	}
}
