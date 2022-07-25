package example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import example.run.Chapter11_05_Add;
import example.run.Chapter11_05_Print;

public class Chapter11_06 {

	public static void main(String[] args) {
		List<String> coList = new CopyOnWriteArrayList<String>();

		new Chapter11_05_Add(coList).start();
		new Chapter11_05_Print(coList).start();
	}
}
