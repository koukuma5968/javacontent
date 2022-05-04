package example;

public class Chapter5_04 {

	public static void main(String[] args) {
		Chapter5_01 func = ((s) -> {
			s = s + "形式";
			System.out.print(s);
		});
		func.print("ステートメント");
	}
}
