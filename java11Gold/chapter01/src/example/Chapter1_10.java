package example;

public enum Chapter1_10 {
	// 列挙子には引数を定義できる
	A("A"),
	B(2),
	// コンストラクタにない引数は定義できない
	C(false);
	// コンストラクタはそれぞれ定義できる
	private Chapter1_10(String str) {
		this.str = str;
	}
	private Chapter1_10(int num) {
		this.num = num;
	}
	public String str;
	public int num;
}
