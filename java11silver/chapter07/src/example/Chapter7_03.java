package example;

import example.sub.Chapter7_03_A;
import example.sub.Chapter7_03_B;

public class Chapter7_03 {
    public static void main(String[] args) {
        // Aクラスを利用
        Chapter7_03_A a = new Chapter7_03_A();
        System.out.println(a.cal(1000, 5));
        // Bクラスを利用
        Chapter7_03_B b = new Chapter7_03_B();
        System.out.println(b.cal(2000, 3));
    }
}