package example;

import java.util.Date;
import java.util.Map;

public class Chapter17_02 {

	private int no = 0;

	// メソッド内の非推奨の警告のみが抑制される
	@SuppressWarnings({"deprecation"})
	private void date(String day) {
		Date date = new Date(day);
	}

	// メソッド内の未使用、非推奨の警告のみが抑制される
	@SuppressWarnings({"unused","deprecation"})
	private Object getClassInstance(Class<?> cl) throws InstantiationException, IllegalAccessException {
		return (Map) cl.newInstance();
	}

}
