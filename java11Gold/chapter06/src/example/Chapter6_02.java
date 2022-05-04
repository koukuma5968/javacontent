package example;

import java.util.ArrayList;
import java.util.List;

public class Chapter6_02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("e");list.add("a");list.add("c");
		list.add("f");list.add("d");list.add("b");

		// リストオブジェクトのストリームを取得
		list.stream()
		// 中間処理 ソート→フィルター→大文字に変換
		.sorted().filter(v -> v.toCharArray()[0] >= "c".toCharArray()[0]).map(v -> v.toUpperCase())
		// 終端処理 ストリーム処理した結果を出力
		.forEach(v -> {
			System.out.println(v);
		});
	}
}
