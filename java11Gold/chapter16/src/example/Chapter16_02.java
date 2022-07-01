package example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Chapter16_02 {

	public static void main(String[] args) {
		// 基底名
		String baseName = Chapter16_02_Resource.class.getName();
		System.out.println(baseName);
		// 作成したリソースを取得
		ResourceBundle jp = ResourceBundle.getBundle(baseName, Locale.getDefault());
		System.out.println("デフォルトロケール");
		jp.keySet().stream().forEach(key -> {
			System.out.println(jp.getString(key));
		});
		ResourceBundle en = ResourceBundle.getBundle(baseName, Locale.ENGLISH);
		System.out.println("ENロケール");
		en.keySet().stream().forEach(key -> {
			System.out.println(en.getString(key));
		});
	}

}
