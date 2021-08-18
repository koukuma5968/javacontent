package example;

import example.sub.Chapter5_01_A;

public class Chapter5_02 {

    public static void main(String[] args) {
        print();
    }

    private static void print() {
        /* ローカル変数でインスタンスを生成
         * printメソッド内で生成されたオブジェクトは
         * メソッドのブロック内でのみメモリ上に保持され、
         * printメソッドの処理が終わると参照が破棄される
         */
        Chapter5_01_A a = new Chapter5_01_A();
        a.setNum(10);

        /* ブロック内の処理が終わる前でも、別のインスタンスやnullを代入することで
         * 最初に生成したインスタンスが破棄される
         */
        Chapter5_01_A b = new Chapter5_01_A();
        b.setNum(5);
        System.out.println("変数bの1回目");
        b.printNum();
        b = new Chapter5_01_A();
        System.out.println("変数bの2回目");
        // 初期化されるので、numの初期値が表示される
        b.printNum();

        // ブロックが終わるまでは保持される
        System.out.println("変数a");
        a.printNum();
    }
}
