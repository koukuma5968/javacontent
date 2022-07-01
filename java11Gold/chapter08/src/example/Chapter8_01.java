package example;

import java.util.stream.Stream;

public class Chapter8_01 {

	public static void main(String[] args) {
		Stream.of("c", "f", "a", "b", "e")
		// Functionインタフェースの実行結果から新しいストリームを取得する、返却値はStream<新しい型>を返す
		.flatMap(val -> Stream.of(val + "2"))
		// Consumerインタフェースの実行結果から新しいストリームを取得する、中間処理の経過内容を確認する使用する
		// flatMapまでを処理した結果を出力
		.peek(System.out::print)
		// Functionインタフェースの実行結果から新しいストリームを取得する、返却値は新しい型を返す
		// 大文字にした結果のbyte[]で新しいストリームを返却する
		.map( val -> val.toUpperCase().getBytes())
		.forEach( val -> {
			System.out.print("  :mapで返されたストリームの型:");
			System.out.print(val.getClass().getTypeName());
			System.out.print("  ");
			System.out.print(new String(val));
			System.out.println();
		});
	}
}
