package example;

import example.sub.Chapter6_02_A;

public class Chapter6_03 {

    public static void main(String[] args) {
        // 引数なしコンストラクタでインスタンス化
        Chapter6_02_A a = new Chapter6_02_A();
        a.print();
        // 引数ありコンストラクタでインスタンス化
        Chapter6_02_A b = new Chapter6_02_A(10);
        b.print();
    }
}
