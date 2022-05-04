package example;

public class Chapter5_03 {

	public static void main(String[] args) {
		String str = "ローカル";
		Chapter5_01 func = ((s) -> {
			s = "パラメータ";
			System.out.print(s);
		});
		func.print(str);
	}
}
