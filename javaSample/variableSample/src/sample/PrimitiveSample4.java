package sample;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveSample4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("リスト");
		List<String> list2 = list;
		if (list == list2) {
			System.out.println(true);
			// 参照を代入した場合同じ参照を持つ
			System.out.println(list2.get(0));
			// 同じ参照である為、どちらを更新しても同じインスタンスが変更される
			list.set(0, "更新");
			System.out.println(list2.get(0));
		} else {
			System.out.println(false);
		}
	}
}
