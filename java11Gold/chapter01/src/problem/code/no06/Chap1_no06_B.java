package problem.code.no06;

public class Chap1_no06_B {
	public static void main(String[] args) {
		var a = new Chap1_no06_A(250) {
			void taxation(int num) {
				setNum(this.getNum() + (this.getNum() * num / 100));
			}
		};
		a.taxation(10);
		System.out.println(a.getNum());
	}
}
