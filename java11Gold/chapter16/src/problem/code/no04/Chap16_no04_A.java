package problem.code.no04;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Chap16_no04_A {
	public void main () {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader(""));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void a(Properties prop) {
		Set Keys = prop.keySet();
		for (Object key : Keys) {
			System.out.println(prop.getProperty(key));
		}
	}
	public void b(Properties prop) {
		Set Keys = prop.keySet();
		for (Object key : Keys) {
			System.out.println(prop.get(key));
		}
	}
	public void c(Properties prop) {
		prop.forEach((k, v) -> System.out.println(v));
	}
	public void d(Properties prop) {
		prop.forEach((v) -> System.out.println(v));
	}
}
