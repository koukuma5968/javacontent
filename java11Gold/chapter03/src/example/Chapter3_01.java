package example;

public interface Chapter3_01 {
	// アクセス修飾子はないがpublic扱い
	default void print(String str) {
		System.out.println(str);
	}
	// protected修飾子は付与できない
	protected default int abs(int a, int b) {
		return a + b;
	}

}
