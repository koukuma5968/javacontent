package problem.code.no10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Cap10_no10 {
	public static void main(String[] args) {
		try (FileInputStream is = new FileInputStream("file.txt")) {
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println("readerror");
		} finally {
			System.out.println("close");
		}
	}
}
