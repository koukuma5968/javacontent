package example;

public class Chapter02_04 {

	public static void main(String[] args) {
		new Chapter02_04().print(5);
	}
	private void print(int b) {
		assert (b > 10) : "不正な値";
		System.out.println("OK");
	}
}
