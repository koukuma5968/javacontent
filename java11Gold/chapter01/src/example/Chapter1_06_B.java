package example;

public class Chapter1_06_B {
	// staticクラス
	static class A {
		public void m() {System.out.println("static");}
	}
	// 非staticクラス
	class B {
		public void m() {System.out.println("非static");}
	}
}
