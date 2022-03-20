package example;

public interface Chapter3_03 {
	private void print(String str) {
		System.out.println(str);
	}
	// private修飾子とdefault修飾子を同時に付与することは出来ない
	private default int abs(int a, int b) {
		return a + b;
	}
}
