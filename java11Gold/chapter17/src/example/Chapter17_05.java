package example;

public class Chapter17_05 {

	// 対象の要素が非推奨であることを示す。
	@Deprecated
	public int num = 0;

	@Deprecated
	public void print() {
		// 非推奨であって使用できない分けでなない為、使用してもエラーとはならない
		System.out.print(num);
	}
}
