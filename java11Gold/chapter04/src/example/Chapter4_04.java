package example;

import java.util.HashMap;

public class Chapter4_04 {

	public static void main(String[] args) {
		// データ型を指定せず、ワイルドカード「?」で記述できる
		HashMap<?, ?> map;
		map = new HashMap<String, String>();
 	}
}
