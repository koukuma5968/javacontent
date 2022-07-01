package example;

import java.util.ListResourceBundle;

// ListResourceBundleを継承したpublicクラスを作成する
public class Chapter16_02_Resource extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		// キー、値の配列を作って返却
		Object[][] jp = {
						{"commit","確定"},
						{"cancel","取り消し"},
						{"back","戻る"},
						};
		return jp;
	}

}
