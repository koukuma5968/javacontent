package example;

public interface Chapter3_04_int {
	default void printadd(String a, String b) {
		print(a+b);
	}
	private void print(String str) {
		System.out.println(str);
	}
}
