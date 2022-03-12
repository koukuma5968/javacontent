package example;

public class Chapter1_03 {

	public void m(String str) {
		// 内部クラス
		class A {}
		// アクセス修飾子を使用できない
		public class B {}
		// static修飾子を使用出来ない。
		static class C {}
		// abstract,final修飾子は使用出来る。
		abstract class D {}
		final class E {}
	}
	public void m2(String str) {
		class F {
			public void print() {
				// 定義元の変数を参照することは可能
				System.out.print(str);
				// 実質的inalである必要があるため、値を代入することは出来ない
				str = "s";
			}
		}
	}

}
