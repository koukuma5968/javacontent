package example;

import example.sub.Chapter5_04_A;

public class Chapter5_04 {

    public static void main(String[] args) {
        /*  static変数はインスタンス化せずに使用する。
         *  基本的にjvm起動時にクラスがロードされ、終了するまで破棄されない。
         */
        System.out.println(Chapter5_04_A.num);
    }
}
