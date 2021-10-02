package problem.code.no15;

public class Cap3_no15_A {

    public static void main(String[] args) {
    	int i = 0;
    	do {
    		if (i < 0 || i > 5) {
    			break;
    		}
            System.out.println(++i);
    	} while(true);
    }
}
