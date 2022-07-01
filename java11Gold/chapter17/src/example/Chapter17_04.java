package example;

// 関数型インタフェースであることを示す
// 関数型インタフェースの定義を満たしていない場合はコンパイルエラー
@FunctionalInterface
public interface Chapter17_04 {
	public void date(String day);
	// 抽象メソッドが2つ定義されているため、関数型インタフェースでないと判定される
	public void date2(String day);
}
