package example;

// 独自アノテーションを標準アノテーションのように使用できる
@Chapter17_07_A
public class Chapter17_07 {

	// @Target（メタ・アノテーション）で対象を指定していないため、
	// クラス、メソッド、引数などのどこにでも宣言出来る。
	@Chapter17_07_A
	public void a(@Chapter17_07_A String a) {}

	// 対象をメソッドのみとしている為、メソッド以外で宣言するとコンパイルエラーとなる
	@Chapter17_07_B
	public void b(@Chapter17_07_B String b) {}
}
