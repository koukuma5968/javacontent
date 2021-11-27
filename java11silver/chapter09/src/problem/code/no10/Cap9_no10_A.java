package problem.code.no10;

public class Cap9_no10_A {
	public static void main(String[] args) {
		int cnt = 0;
		Runnable run = () -> {
			while (cnt < 10) {
				System.out.println(cnt++);
			}
		};
		new Thread(run).start();
	}
}
