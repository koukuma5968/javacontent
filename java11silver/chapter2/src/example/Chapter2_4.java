package example;

public class Chapter2_4 {

	public static void main(String[] args) {

		// ローカル変数を初期化
		int local = 10;

		// 初期化後、ブロック内で利用可
		System.out.println(local);

		// 子ブロック
		if (true) {
			// 子ブロック内でも利用可
			System.out.println(local);

			// 子ブロック内でローカル変数を初期化
			int local2 = 20;
		}

		// local2はブロック外になり利用できない（コンパイルエラー）
		System.out.println(local2);

		// printメソッドの呼び出し
		print();
	}

	private static void print() {
		// 別メソッド（ブロック外）である為、利用できない。
		System.out.println(local);
	}
}
