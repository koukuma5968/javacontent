package problem.code.no20;

public class Cap3_no20_A {

    public static void main(String[] args) {
    	String[][] alpha = {{"A","B", "C", "D"},
    						{"a","b", "c", "d"}};
    	for (String[] a : alpha) {
    		for (String b : a) {
    			if ("C".equals(b.toUpperCase()) || "b".equals(b)) continue;
                System.out.print(b);
    		}
    	}
    }
}
