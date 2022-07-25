package example.run;

import java.util.List;

public class Chapter11_05_Add extends Thread {
	private List<String> coList;
	public Chapter11_05_Add(List<String> coList) {
		System.out.println("add");
		this.coList = coList;
	}

	@Override
	public void run() {
		for (int i=0; true; i++) {
			coList.add(String.valueOf(i));
		}
	}
}
