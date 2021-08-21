package example;

import example.sub.Chapter6_01_A;

public class Chapter6_01 {

    public static void main(String[] args) {
        Chapter6_01_A a = new Chapter6_01_A();
        // 引数にString型変数を渡し、戻り値を受け取る
        String ret = a.addString("method");
        System.out.println(ret);
        // 数値型変数を渡す
        a.print(10);
    }

}
