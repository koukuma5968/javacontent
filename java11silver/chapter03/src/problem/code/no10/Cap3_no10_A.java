package problem.code.no10;

public class Cap3_no10_A {

    public static void main(String[] args) {
        int a = 10;
        switch (a % 2) {
	        case 2 :
	            System.out.println("A");
	        	break;
	        case 0 :
	            System.out.println("B");
	        case 1 :
	            System.out.println("C");
        	default :
	            System.out.println("D");
	        	break;
        }
    }
}
