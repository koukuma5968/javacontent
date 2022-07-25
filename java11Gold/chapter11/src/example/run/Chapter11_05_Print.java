package example.run;

import java.util.List;

public class Chapter11_05_Print extends Thread {
	private List<String> coList;
	public Chapter11_05_Print(List<String> coList) {
		System.out.println("add");
		this.coList = coList;
	}
	@Override
	public void run() {
		System.out.println("print");
		while (true) {
			for (String v : coList) {
				System.out.print(v);
				System.out.print(",");
			}
		}
	}
}
