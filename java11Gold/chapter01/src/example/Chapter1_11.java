package example;

// インターフェースを実装できる
public enum Chapter1_11 implements Chapter1_11_inter {
	A("A"),
	B("B"),
	C("C") {
		// メソッドの実装は列挙子個別に付けることも出来る
		@Override
		public void print() {
			System.out.println("D");
		}
	};
	private Chapter1_11(String str) {
		this.str = str;
	}
	public String str;
	@Override
	public void print() {
		System.out.println(this.str);
	}
}
