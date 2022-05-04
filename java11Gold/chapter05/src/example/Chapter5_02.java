package example;

public class Chapter5_02 {

	public static void main(String[] args) {
		Chapter5_01 func = (s -> {
			System.out.print("関数型" + s);
		});
		func.print("インタフェース");
	}
}
