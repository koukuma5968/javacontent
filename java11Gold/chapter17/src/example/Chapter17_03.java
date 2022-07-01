package example;

public class Chapter17_03 implements Chapter17_04 {

	// インタフェースの抽象メソッドを実装していることを示す。
	@Override
	public void date(String day) {
	}

	// インタフェース存在しないメソッドに付与した場合コンパイルエラーとなる。
	@Override
	public void date3(String day) {
	}

}
