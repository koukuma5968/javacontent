package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chapter13_02 {

	public static void main(String[] args) {
		String line = "";
		File file = new File("./chapter13/chapter13_file");
		try(BufferedReader br = new BufferedReader(new FileReader(file.getAbsoluteFile()))){
			line = br.readLine();
			System.out.print("読み込み=" + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()))) {
			bw.append(line + "読取りと書込みを行う");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
