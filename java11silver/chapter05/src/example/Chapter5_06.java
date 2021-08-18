package example;

import example.sub.Chapter5_06_A;

public class Chapter5_06 {

    public static void main(String[] args) {
        // クラスインスタンスを生成
        Chapter5_06_A a = new Chapter5_06_A();
        // フィールド値（インスタンス変数）を取得
        System.out.println(a.num);
        // フィールドに値を設定
        a.num = 5;
        // 設定後に値を取得
        System.out.println(a.num);
    }
}
