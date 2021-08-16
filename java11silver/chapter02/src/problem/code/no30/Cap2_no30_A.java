package problem.code.no30;

public class Cap2_no30_A {
    public static void main(String[] args) {
        StringBuilder bl = new StringBuilder("abdgfe");
        bl.reverse();
        bl.replace(1, 3, "h");
        System.out.println(bl);
    }
}
