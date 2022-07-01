package example;

import java.util.Date;

// 未使用、非推奨の警告を制御
// クラス内のすべての警告が抑制される
@SuppressWarnings({"unused","deprecation"})
public class Chapter17_01 {

	private int no = 0;

	private void date(String day) {
		Date date = new Date(day);
	}

	private Object getClassInstance(Class<?> cl) throws InstantiationException, IllegalAccessException {
		return cl.newInstance();
	}

}
