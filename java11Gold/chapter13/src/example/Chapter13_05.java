package example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter13_05 {

	public static void main(String[] args) {
		Path path = Paths.get("./chapter13/chapter13_fire");
		System.out.println("Pathオブジェクト=" + path);
		System.out.println("ファイル名=" + path.getFileName());
		System.out.println("親フォルダ=" + path.getParent());
	}
}
