package example;

import java.util.ListResourceBundle;

// en用のリソースクラスを作成する
public class Chapter16_02_Resource_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		Object[][] en = {
						{"commit","commit"},
						{"cancel","cancel"},
						{"back","back"},
						};
		return en;
	}

}
