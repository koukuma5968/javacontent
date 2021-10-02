package problem.code.no07;

public class Cap3_no07_A {

    public static void main(String[] args) {
    	Cap3_no07_B b = new Cap3_no07_B("a");
        if (b.chkStr("b")) {
            System.out.println("b");
        } else if (b.chkStr("a")) {
            System.out.println("a");
        } else {
            System.out.println("c");
        }
    }
}
