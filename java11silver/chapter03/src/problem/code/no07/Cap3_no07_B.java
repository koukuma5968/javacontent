package problem.code.no07;

public class Cap3_no07_B {

	private String a;

	public Cap3_no07_B(String a) {
        this.a = a;
    }

	public boolean chkStr(String a) {
		return a != a ? true : false;
	}
}
