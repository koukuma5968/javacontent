package example.sub;

public class Chapter7_03_A {
    public double cal(double a, double f) {
        // 内部クラスを利用
        Chapter7_03_C c = new Chapter7_03_C();
        return c.multiplication(a, f);
    }
    // 内部クラス
    protected class Chapter7_03_C {
        protected double multiplication(double a, double f) {
            return a * f;
        }
    }
}

