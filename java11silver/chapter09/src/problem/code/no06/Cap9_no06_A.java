package problem.code.no06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cap9_no06_A {
	static Map<String, String> map = new HashMap<>();
	static List<String> keys = List.of("key", "get", "set");
	public static void main(String[] args) {
		keys.clear();
		keys.add("add");
		keys.forEach(key -> System.out.print(key + ","));
	}
}
