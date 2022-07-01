package example;

import java.text.NumberFormat;
import java.util.Locale;

public class Chapter16_06 {

	public static void main(String[] args) {
		// 日本の数値フォーマットのインスタンスを取得
		NumberFormat jp_num = NumberFormat.getInstance(Locale.JAPAN);
		System.out.println(jp_num.format(1000000));

		// 日本の通貨フォーマットのインスタンスを取得
		NumberFormat jp_cur = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(jp_cur.format(1000000));

		// 米国の数値フォーマットのインスタンスを取得
		NumberFormat us_num = NumberFormat.getInstance(Locale.US);
		System.out.println(us_num.format(1000000));

		// 米国の通貨フォーマットのインスタンスを取得
		NumberFormat us_cur = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(us_cur.format(1000000));

	}

}
