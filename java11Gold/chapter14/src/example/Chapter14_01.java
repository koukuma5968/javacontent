package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Chapter14_01 {

	public static void main(String[] args) {
		Chapter14_01_sub ob = new Chapter14_01_sub(1, "シリアライズ・プロキシ");
		File file = new File("./chapter14/chapter14_object");
		System.out.println("シリアライズ");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getAbsoluteFile()))) {
			file.createNewFile();
			oos.writeObject(ob);
		} catch (IOException e) {}
		System.out.println("デシリアライズ");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getAbsoluteFile()))) {
			Chapter14_01_sub dob = (Chapter14_01_sub) ois.readObject();
			dob.print();
		} catch (IOException | ClassNotFoundException e) {}

	}
}
