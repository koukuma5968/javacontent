package problem.code.no05;

public class Cap5_no05_A {

    public static void main(String[] args) {
    	Cap5_no05_B b = new Cap5_no05_B();
    	b.setWorld("world");
    	test(b);
    	// more code;
    }

    private static void test(Cap5_no05_B b) {
    	b = new Cap5_no05_B();
    	b.setWorld("java");
    	Cap5_no05_B.hello = null;
    }
}
