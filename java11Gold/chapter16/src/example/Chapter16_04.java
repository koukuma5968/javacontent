package example;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Chapter16_04 {

	public static void main(String[] args) {
		// 基底名
		String baseName = "example.prop.Chapter16_04_Resource";
		// 作成したリソースを取得
		ResourceBundle jp = ResourceBundle.getBundle(baseName, Locale.getDefault());
		Object[] param = {"tom", jp.getString("jp")};
		String msg = MessageFormat.format(jp.getString("mess"), param);
		System.out.println(msg);

		ResourceBundle en = ResourceBundle.getBundle(baseName, Locale.ENGLISH);
		Object[] param2 = {"taro", en.getString("us")};
		msg = MessageFormat.format(en.getString("mess"), param2);
		System.out.println(msg);
	}

}
