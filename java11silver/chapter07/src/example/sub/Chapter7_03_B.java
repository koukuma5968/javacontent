package example.sub;

import example.sub.Chapter7_03_A.Chapter7_03_C;

public class Chapter7_03_B {
    public double cal(double a, double f) {
        // Chapter7_03_Aのインスタンスを生成し、
        // AクラスのインスタンスからCのインスタンスを生成する
        Chapter7_03_C c = new Chapter7_03_A().new Chapter7_03_C();
        return c.multiplication(a, f);
    }
}

