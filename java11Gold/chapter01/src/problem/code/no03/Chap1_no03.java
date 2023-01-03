package problem.code.no03;

public class Chap1_no03 {
	public static void main(String[] args) {
		new Chap1_no03().cal();
	}
	private int num = 2;
	public void cal() {
		Inner i = new Inner();
		i.b = 50;
		i.print(num);
	}

	private static class Inner {
		private int b;
		void print(int n) {
			System.out.println(b * n);
		}
	}
}
