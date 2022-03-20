package example;

public class Chapter4_06 {
	public static void main(String[] args) {
		// 利用する型を指定
		Chapter4_05<String> a = new Chapter4_05<String>();
		a.add("型パラメータ");
		// メソッドは型推論され指定は必要ない
		int i = a.getType(10);
	}
}
