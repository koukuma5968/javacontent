package example;

import inter.Chapter9_05_interface;

public class Chapter9_05 {

    public static void main(String[] args) {
        // ローカル変数
        int local = 10;
        // ラムダ式で個別の実装を持たせたインスタンスを生成
        // 一行で記述する場合はブロック({})の記述も不要です。
        Chapter9_05_interface a = (num, num2) -> num + num2 + local;
        // 引数は型を指定してもしなくてもコンパイラーが解決するので問題ない
        Chapter9_05_interface b = (int num, int num2) -> {
            // 匿名クラスと同等である為、スコープ外の変数は実質的finalとなり、代入は出来ない。
            local = num2;
            return num - num2;
        };
        System.out.println(a.calculation(1, 2));
        System.out.println(b.calculation(5, 3));
    }
}