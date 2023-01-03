package problem.code.no07;

public class Chap1_no07_B {
	public static void main(String[] args) {
		var a = new Chap1_no07_A() {
			public Chap1_no07_A() {
				System.out.println("B");
			}
		};
	}
}
