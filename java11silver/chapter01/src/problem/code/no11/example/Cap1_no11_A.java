package problem.code.no11.example;

import java.util.ArrayList;

import problem.code.no11.example.chapter.Cap1_no11_B;

public class Cap1_no11_A {
	public static void main(String[] args) {
	    ArrayList<String> arr = new ArrayList<String>();
	    arr.add(args[0]);
	    Cap1_no11_B cp = new Cap1_no11_B();
	    cp.print(Integer.parseInt(arr.get(0)));
	}
}