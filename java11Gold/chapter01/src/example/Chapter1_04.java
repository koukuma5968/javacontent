package example;

public class Chapter1_04 {

	public static void main(String[] args) {
		new Chapter1_04().m("internal");
	}
	public void m(String str) {
		// 内部クラス
		class A {
			public void print() {
				System.out.print(str);
			}
		}
		// インスタンス化して実行
		new A().print();
	}

}
