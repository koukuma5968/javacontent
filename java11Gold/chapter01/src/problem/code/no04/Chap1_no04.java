package problem.code.no04;

public class Chap1_no04 {
	public static void main(String[] args) {
		Chap1_no04 c = new Chap1_no04();
		c.msg();
		c.new Inner().print();
	}
	void msg() {
		Inner.mes = "Java";
	}
	class Inner {
		private static String mes;
		public void print() {
			System.out.println(mes);
		}
	}
}
