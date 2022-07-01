package example;

import java.util.Locale;

public class Chapter16_01 {

	public void getLocal() {
		// 言語コードを指定してインスタンス取得
		Locale ja = new Locale(Locale.JAPANESE.getCountry());
		// 言語コードと国コードを指定してインスタンス取得
		Locale ja_JP = new Locale(Locale.JAPANESE.getCountry(), Locale.JAPAN.getCountry());
	}

}
