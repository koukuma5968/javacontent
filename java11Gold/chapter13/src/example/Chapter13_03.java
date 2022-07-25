package example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Chapter13_03 {

	public static void main(String[] args) {
		Chapter13_03_sub ob = new Chapter13_03_sub();
		ob.setId(1);
		ob.setName("シリアライズ");
		File file = new File("./chapter13/chapter13_object");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getAbsoluteFile()))) {
			file.createNewFile();
			oos.writeObject(ob);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
