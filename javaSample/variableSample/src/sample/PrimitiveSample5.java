package sample;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveSample5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("リスト");
		List<String> list2 = new ArrayList<String>();
		list2.add("リスト");
		if (list == list2) {
			System.out.println("インスタンス一致");
		} else {
			System.out.println("インスタンス不一致");
			// Stringを要素に持つのでequalsメソッドで要素0の値を判定する
			if (list.get(0).equals(list2.get(0))) {
				System.out.println("値一致");
			}
		}
	}
}
