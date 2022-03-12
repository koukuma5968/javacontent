package example;

public class Chapter1_07 {
	public void print(String str) {
		str = "無名クラス";
		// 無名クラス
		// クラス名がないので修飾子、コンストラクタは使用できない
		new Chapter1_07_inter() {
			@Override
			public void print() {
				// 引数にメソッド内で代入しているため、参照できない(実施的finalでない)
				System.out.print(str);
			}
		};
	}
}
