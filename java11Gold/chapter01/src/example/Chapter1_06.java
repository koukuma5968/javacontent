package example;

public class Chapter1_06 {
	class C {
		public void m() {System.out.println("自クラス");}
	}
	public static void main(String[] args) {
		// staticクラスを使用
		new Chapter1_06_B.A().m();
		// 非staticクラスを使用
		new Chapter1_06_B().new B().m();
		new Chapter1_06().print();
	}
	public void print() {
		// インスタンス内のクラスを使用
		new C().m();
	}
}
