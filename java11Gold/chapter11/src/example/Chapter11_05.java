package example;

import java.util.ArrayList;
import java.util.List;

import example.run.Chapter11_05_Add;
import example.run.Chapter11_05_Print;

public class Chapter11_05 {

	public static void main(String[] args) {
		List<String> coList = new ArrayList<String>();

		new Chapter11_05_Add(coList).start();
		new Chapter11_05_Print(coList).start();
	}
}
