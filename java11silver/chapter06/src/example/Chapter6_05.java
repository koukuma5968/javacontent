package example;

import example.sub.Chapter6_05_A;

public class Chapter6_05 {

    public static void main(String[] args) {
        // staticメソッドの呼び出し
        Chapter6_05_A.print();
        // static変数の参照
        System.out.println(Chapter6_05_A.s);
    }
}
