package problem.code.no14;

import java.util.Arrays;
import java.util.Iterator;

public class Cap3_no14_A {

    public static void main(String[] args) {
    	Iterator<Integer> list = Arrays.asList(10, 20, 50, 30).iterator();
    	while (list.hasNext()) {
    		int l = list.next();
    		if (50 > l) {
    			break;
    		}
            System.out.println(l);
    	}
    }
}
