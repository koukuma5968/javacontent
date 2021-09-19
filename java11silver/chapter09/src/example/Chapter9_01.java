package example;

import inter.Chapter9_01_impl;
import inter.Chapter9_01_interface;

public class Chapter9_01 {

    public static void main(String[] args) {
        // 実装クラスのインスタンスを生成し、インターフェースの型で宣言
        Chapter9_01_interface android = new Chapter9_01_impl();
        // インスタンス生成したクラスに実装したメソッドの処理が実行される
        System.out.println(android.name());
    }
}