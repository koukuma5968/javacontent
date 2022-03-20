package example;

public class Chapter4_02 {

	public static void main(String[] args) {
		int a = 5;
		// オートボクシング
		Integer i = a;
		// オートアンボクシング
		int b = i;
		System.out.println(i + b);
	}
}
