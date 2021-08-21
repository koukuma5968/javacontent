package example;

import example.sub.Chapter6_04_A;

public class Chapter6_04 {

    public static void main(String[] args) {
        Chapter6_04_A a = new Chapter6_04_A();
        // String型のみのメソッドの呼び出し
        a.print("文字列のみ");
        // 数値型のみのメソッドの呼び出し
        a.print(5);
        // String型と数値型のメソッドの呼び出し
        a.print("文字列と数値", 20);
    }
}
