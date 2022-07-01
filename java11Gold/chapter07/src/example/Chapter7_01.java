package example;

import java.util.List;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;

public class Chapter7_01 {

	public static void main(String[] args) {
		IntFunction<Integer> intF = (i) -> i++;
		ObjDoubleConsumer<List<Double>> odc = (type, value) -> type.add(value);
	}
}
