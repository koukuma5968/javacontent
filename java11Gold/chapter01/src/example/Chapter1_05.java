package example;

public class Chapter1_05 {
	// フィールド変数
	private String str = "nest";

	// ネストクラス
	class A {}
	// アクセス修飾子は使用できる
	public class B {}
	// staticクラスはをフィールド変数にアクセス出来ない。
	static class C {
		public void m() {System.out.print(str);}
	}
	// 非staticクラスはをstaticメンバを持つことが出来ない。
	class D {
		static String d = "";
		public static void m() {}
	}
	// abstract,final修飾子は使用出来る。
	abstract class E {}
	final class F {}


}
