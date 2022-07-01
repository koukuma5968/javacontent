package example;

import java.util.function.Supplier;

public class Chapter6_03 {

	public static void main(String[] args) {
		// コンストラクタ参照 ラムダ式：Supplier<Chapter6_03_sub> sub = () -> new Chapter6_03_sub();
		Supplier<Chapter6_03_sub> sub = Chapter6_03_sub::new;
		// staticメソッド参照 ラムダ式：Chapter6_03_inter s = val -> Chapter6_03_sub.print(val);
		Chapter6_03_inter s = Chapter6_03_sub::print;
		String val = "aaa";
		s.p(val);
		// インスタンス参照 ラムダ式：Chapter6_03_inter2 i = (a,b) -> new Chapter6_03_sub().abs(a,b);
		Chapter6_03_inter2 i = sub.get()::abs;
		System.out.println(i.a(1, 5));
	}
}
