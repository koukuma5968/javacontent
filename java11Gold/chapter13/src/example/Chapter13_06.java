package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chapter13_06 {

	public static void main(String[] args) {
		File file = new File("./chapter13/chapter13_file");
		Path path = Paths.get(file.getAbsolutePath());
		System.out.println("ファイル有無=" + Files.exists(path));

		File file2 = new File("./chapter13/chapter13_file2");
		Path path2 = Paths.get(file2.getAbsolutePath());

		File file3 = new File("./chapter13/file/chapter13_file");
		Path path3 = Paths.get(file3.getAbsolutePath());

		File file4 = new File("./chapter13/chapter13_file3");
		Path path4 = Paths.get(file4.getAbsolutePath());

		try {
			Files.copy(path, path2);
			Files.move(path, path3);
			Files.delete(path4);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
