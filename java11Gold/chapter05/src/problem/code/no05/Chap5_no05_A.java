package problem.code.no05;

import java.util.function.BinaryOperator;

public class Chap5_no05_A {
	public static void main(String[] args) {
		BinaryOperator bnp = (a, b) -> a - b;
		BinaryOperator<Integer, Integer, String> bnp2 = (a, b) -> Integer.toString(a + b);
		BinaryOperator<Integer> bnp3 = (a, b) -> a / b;
		BinaryOperator<Integer, String> bnp4 =  (a, b) -> (a).equals(b);
	}
}
