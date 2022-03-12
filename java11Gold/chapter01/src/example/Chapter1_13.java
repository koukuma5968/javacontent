package example;

public class Chapter1_13 {
	public static void main(String[] args) {
		// 列挙子名の文字列を返す
		System.out.println("---name---");
		System.out.println(Chapter1_11.A.name());
		// 列挙子の配列を返す
		System.out.println("---values---");
		Chapter1_11[] values = Chapter1_11.values();
		for (Chapter1_11 v: values) {
			v.print();
		}
		// 列挙子の位置を返す。
		System.out.println("---ordinal---");
		System.out.println(Chapter1_11.B.ordinal());
		// 指定した列挙型から文字列に一致する列挙子を返す
		System.out.println("---valueOf---");
		Enum.valueOf(Chapter1_11.class, "A").print();
	}
}
