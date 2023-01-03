package problem.code.no03;

import java.util.Locale;

public class Chap16_no03_A {
	public void a() {
		Locale lo = new Locale.Builder()
				.setLanguage("jp")
				.setRegion("JP")
				.setScript("Japan")
				.build();
	}
	public void b() {
		Locale lo = new Builder()
				.setLanguage("jp")
				.setRegion("JP")
				.setScript("Japan")
				.build();
	}
	public void c() {
		Locale lo = new Locale().new Builder()
				.setLanguage("jp")
				.setRegion("JP")
				.setScript("Japan")
				.build();
	}
	public void d() {
		Locale lo = new Locale()
				.setLanguage("jp")
				.setRegion("JP")
				.setScript("Japan")
				.build();
	}
}
