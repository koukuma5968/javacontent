package example;

import example.sub.Chapter5_01_A;

public class Chapter5_03 {

    public static void main(String[] args) {
        // メソッド呼び出し前にインスタンス生成
        Chapter5_01_A a = new Chapter5_01_A();
        print(a);
        System.out.println("メソッド終了後");
        // メソッド終了後
        a.printNum();
    }

    private static void print(Chapter5_01_A a ) {
        // 引数で渡されたオブジェクトにセット
        a.setNum(10);
        System.out.println("メソッド終了前");
        // メソッド終了前
        a.printNum();
    }
}
