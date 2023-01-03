package problem.code.no04;

import java.util.Scanner;

public class Chap13_no04_A {
	public static void main(String[] args) {
		Scanner s = new Scanner("A,B,c,D,e");
		s.useDelimiter(",");
		try (s) {
			while (s.hasNext()) {
				if(s.hasNext("[a-z]*")) {
					System.out.println(s.next());
				} else {
					s.next();
				}
			}
		}
	}
}
