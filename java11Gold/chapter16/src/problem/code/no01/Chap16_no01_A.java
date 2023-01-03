package problem.code.no01;

import java.util.Locale;

public class Chap16_no01_A {
	public void a() {
		Locale lo = System.getDefault();
	}
	public void b() {
		Locale lo = System.locale.getDefault();
	}
	public void c() {
		Locale lo = Locale.getDefault();
	}
	public void d() {
		Locale lo = Locale.getInstance();
	}
}
