package problem.code.no03;

public class Chap3_no03_M implements Chap3_no03_A,Chap3_no03_D {
	@Override
	public void print() {
		Chap3_no03_A.super.print();
		Chap3_no03_B.super.print();
		Chap3_no03_C.super.print();
	}
}
