package problem.code.no05;

import java.util.ArrayList;
import java.util.Arrays;

public class Cap9_no04_A {
    public static void main(String[] args) {
        var numeric = new ArrayList<>(
            Arrays.asList(new String[] {"1", "5", "10", "4", "9"}));
        numeric.sort((var a, var b) -> {
            return -String.format("%2s", a).compareTo(String.format("%2s", b));
        });
        numeric.forEach(System.out::println);
    }
}
