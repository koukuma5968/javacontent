package example.sub;

import java.math.BigDecimal;

public class Chapter7_02_B {
    public double cal(double balance, double amount, boolean transfer) {
        double cal;
        // インナークラスを利用
        Chapter7_02_B2 b = new Chapter7_02_B2();
        // 同一パッケージ内からの利用
        Chapter7_02_A a = new Chapter7_02_A();
        double amountfee = a.subtraction(amount, b.fee(amount));
        if (transfer) {
            cal = a.addition(balance, amountfee);
        } else {
            cal = a.subtraction(balance, amountfee);
        }
        return cal;
    }
}
class Chapter7_02_B2 {
    double fee(double b) {
        return new BigDecimal(b * 0.03).doubleValue();
    }
}