package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Chapter17_06 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("aaa"); // String型を追加
		List l2 = new ArrayList();
		l2.add(2); // int型を追加
		// メソッド側はList<String>を期待しているが、変数「l2」はジェネリックスを指定していない為、
		// 引数として渡すことが出来る
		m(l,l2);
	}

	// mainメソッドから渡されるようにString型以外の要素を持つリストが渡されたとき
	// 実行時にClassCastExceptionが発生します。
	// @SafeVarargsは警告を無視するのみでエラーを抑止することはないので、プログラマが意識する必要があります。
	@SafeVarargs
	static void m(List<String>... stringLists) {
		   String s = stringLists[0].get(0);
	}

	// @SafeVarargsはstatic、final、privateのいずれかの修飾子がないと記述できない
	@SafeVarargs
	public void print(Map<String, Integer>... num) {
		System.out.print(num[0]);
	}

}
