package problem.code.no11;

public class Cap3_no11_A {

    public static void main(String[] args) {
        String a = Cap3_no11_B.value();
        switch (a) {
	        case "A" :
	            System.out.println("A");
	        case "B" :
	            System.out.println("B");
	        	break;
	        case "C" :
	            System.out.println("C");
        	default :
	            System.out.println("D");
        }
    }
}
