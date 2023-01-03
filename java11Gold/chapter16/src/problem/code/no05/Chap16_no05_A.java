package problem.code.no05;

import java.util.Properties;
import java.util.ResourceBundle;

public class Chap16_no05_A {
	public void a() {
		ResourceBundle resource = new ResourceBundle("sample");
	}
	public void b() {
		ResourceBundle resource = new ResourceBundle("sample.properties");
	}
	public void c(Properties prop) {
		ResourceBundle resource = ResourceBundle.getBundle("sample");
	}
	public void d(Properties prop) {
		ResourceBundle resource = ResourceBundle.getBundle("sample.properties");
	}
}
