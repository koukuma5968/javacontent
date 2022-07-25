package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Chapter13_07 {

	public static void main(String[] args) {
		File file = new File("./chapter13/");
		Path path = Paths.get(file.getAbsolutePath());
		try {
			Stream<Path> stPaht = Files.list(path);
			stPaht.forEach(p -> {
				// フォルダ配下のPathをストリームで処理する
				System.out.println(p.getFileName());
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
