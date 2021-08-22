package example.sub;

public class Chapter7_04_A {
    public double cal(double a, double f) {
        // 内部クラスを利用
        Chapter7_04_B b = new Chapter7_04_B();
        return b.division(a, f);
    }
    // 内部クラス
    private class Chapter7_04_B {
        protected double division(double a, double f) {
            return a / f;
        }
    }
}

