package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Chapter13_04 {

	public static void main(String[] args) {
		File file = new File("./chapter13/chapter13_object");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.getAbsoluteFile()))) {
			Chapter13_03_sub ob = (Chapter13_03_sub) ois.readObject();
			System.out.println("id=" + ob.getId());
			System.out.println("name=" + ob.getName());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
