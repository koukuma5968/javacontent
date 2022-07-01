package example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Chapter16_05 {

	public static void main(String[] args) {
		// 出力するフォーマットパターン
		String pattern = "G yyyy-MM-dd E HH:mm:ss";
		// 現在日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日本表記のフォーマット取得
		DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern, Locale.JAPANESE);
		System.out.println(now.format(format));
		// 米国表記のフォーマットで出力
		// localizedByの引数に渡したロケールでformatのコピーが作られる
		System.out.println(now.format(format.localizedBy(Locale.ENGLISH)));

	}

}
