package problem.code.no06;

public class Cap6_no06_A {
	public static void print(Integer a, Integer b) {
		System.out.println("A");
	}
	public static void print(double a, double b) {
		System.out.println("B");
	}
	public static void print(float a, float b) {
		System.out.println("C");
	}
	public static void print(int a, int b) {
		System.out.println("D");
	}
	public static void main(String[] args) {
		print(10, 20);
		print(10.0, 20.0);
	}
}
