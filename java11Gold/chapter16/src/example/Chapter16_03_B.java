package example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PropertyResourceBundle;

// PropertyResourceBundleを利用してリソースを取得する
public class Chapter16_03_B {

	public static void main(String[] args) {
		String baseName = Chapter16_03_B.class.getResource("./prop").getPath();
		// 作成したリソースを取得
		File dir = new File(baseName);
		File[] files = dir.listFiles();
		for (File f : files) {
			try (FileReader fr = new FileReader(f)) {
				PropertyResourceBundle resouce = new PropertyResourceBundle(fr);
				System.out.println(f.getName());
				resouce.keySet().stream().forEach(key -> {
					System.out.println(resouce.getString(key));
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
