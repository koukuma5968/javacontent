package example;

import java.util.Locale;
import java.util.ResourceBundle;

// ResourceBundleから利用した場合
public class Chapter16_03_A {

	public static void main(String[] args) {
		// 基底名
		String baseName = "example.prop.Chapter16_03_Resource";
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
