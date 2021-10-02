package problem.code.no08;

public class Cap3_no08_A {

    public static void main(String[] args) {
    	Cap3_no08_B b = new Cap3_no08_B();
    	b.setValue("String");
    	Cap3_no08_C c = new Cap3_no08_C();
    	c.setValue(1);
        if (b.getValue() instanceof Integer) {
            System.out.println(b.getValue());
        } else if (c.getValue() instanceof Boolean) {
            System.out.println(Boolean.TRUE);
        } else if (c.getValue() instanceof Integer) {
            System.out.println(c.getValue());
        }
    }
}
