package problem.code.no13;

import java.util.ArrayList;
import java.util.List;

public class Cap8_no13C{
	public static void main(String[] args) {
		Cap8_no13A cap1 = new Cap8_no13A();
		Cap8_no13A cap2 = new Cap8_no13B();
		Cap8_no13B cap3 = new Cap8_no13B();

		List<String> list = new ArrayList<>();

		cap1.print(list);

		cap2.print(list);

		cap2.print(list);

		cap3.print(list);

		cap3.print(list);
	}
}
