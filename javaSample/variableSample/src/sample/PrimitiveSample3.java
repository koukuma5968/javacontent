package sample;

public class PrimitiveSample3 {

	public static void main(String[] args) {
		String str = "参照";
		String str2 = new String("参照");
		// 参照が違えば一致しない
		if (str == str2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
