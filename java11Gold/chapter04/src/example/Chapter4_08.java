package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter4_08 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("aaa");l.add("ccc");l.add("ddd");l.add("bbb");
		l.sort(new AscendingOrder());
		l.forEach(a -> {System.out.print(a);System.out.print(",");});
		System.out.println();
		l.sort(new ReverseOrder());
		l.forEach(a -> {System.out.print(a);System.out.print(",");});
	}

}
// Comparatorインタフェースを実装したクラスによる昇順ソート
class AscendingOrder implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
//Comparatorインタフェースを実装したクラスによる降順ソート
class ReverseOrder implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

