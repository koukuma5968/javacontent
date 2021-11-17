package problem.code.no03;

public class Cap8_no03_sub extends Cap8_no03_Super {

	public void print() {
		System.out.println("sub");
	}

	public void print(String str) {
		super.print(str + "sub");
	}
}
