package problem.code.no02;

public class Chap1_no02 {

	class Inner {
		public void print() {
			System.out.println("Chap1_no02");
		}
	}

	public static void main(String[] args) {
		new Inner();
		new Chap1_no02.Inner();
		new Chap1_no02.new Inner();
		new Chap1_no02:Inner();
	}
}
