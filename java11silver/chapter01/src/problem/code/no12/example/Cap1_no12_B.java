package problem.code.no12.example;

import java.util.logging.Logger;

public class Cap1_no12_B {
	static final Logger logger = Logger.getAnonymousLogger();
	public static void main(String[] args) {
		var d = new Cap1_no12_A("sample");
		logger.info(d.toString());
	}
}
