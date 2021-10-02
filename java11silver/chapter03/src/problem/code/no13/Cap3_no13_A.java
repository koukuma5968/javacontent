package problem.code.no13;

public class Cap3_no13_A {

    public static void main(String[] args) {
        chk(Cap3_no13_ENUM.B);
    }
    private static void chk(Cap3_no13_ENUM e) {
    	switch (e) {
    		case A :
    	        System.out.println("A");
    	    	return;
    		case B :
    	        System.out.println("B");
    	        break;
    		case C :
    	        System.out.println("C");
    	    	return;
    		case D :
    	        System.out.println("D");
   			default :
    	        System.out.println("E");
    	    	return;
    	}
    }
}
