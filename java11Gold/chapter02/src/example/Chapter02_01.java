package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Chapter02_01 {

	public static void main(String[] args) {
		File f = new File("file");
		try(BufferedReader br = new BufferedReader(new FileReader(f.getAbsoluteFile()));){
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
