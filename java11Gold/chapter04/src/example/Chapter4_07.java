package example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Chapter4_07 {
	public static void main(String[] args) {
		// Listインタフェース
		List<String> l = new ArrayList<String>();
		l.add("aaa");l.add("bbb");l.add("aaa");
		l.forEach(a -> {System.out.print(a);System.out.print(",");});
		System.out.println();
		// Setインタフェース
		Set<String> s = new HashSet<String>();
		s.add("aaa");s.add("bbb");s.add("aaa");
		s.forEach(a -> {System.out.print(a);System.out.print(",");});
		System.out.println();
		// Queueインタフェース
		Queue<String> q = new ArrayDeque<String>();
		q.add("aaa");q.add("bbb");q.add("aaa");
		q.forEach(a -> {System.out.print(a);System.out.print(",");});
		System.out.println();
		// Mapインタフェース
		Map<String, String> m = new HashMap<String, String>();
		m.put("key1", "aaa");m.put("key1", "bbb");m.put("key1", "aaa");
		m.forEach((key,value) -> {System.out.print(key + ":" + value);System.out.print(",");});
	}
}
