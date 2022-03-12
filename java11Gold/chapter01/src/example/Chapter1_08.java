package example;

public class Chapter1_08 {
	public static void main(String[] args) {
		new Chapter1_08().print("無名クラス");
		new Chapter1_08().print("無名クラス2");
	}
	public void print(String str) {
		// 無名クラスは定義したメソッド内でのみ有効
		Chapter1_07_inter anon = new Chapter1_07_inter() {
			@Override
			public void print() {
				System.out.println(str);
			}
		};
		anon.print();
	}
}
