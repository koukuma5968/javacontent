package example.sub.child;

import example.sub.Chapter7_02_A;

public class Chapter7_02_C {

    public int cal(int balance, int amount, boolean transfer) {
        int cal;
        // 同一パッケージ内からの利用
        Chapter7_02_A a = new Chapter7_02_A();
        if (transfer) {
            cal = a.addition(balance, amount);
        } else {
            cal = a.subtraction(balance, amount);
        }
        return cal;
    }
}
