package example;

// Chapter5_01_Aクラスはパッケージ階層が異なるのでimportが必要
import example.sub.Chapter5_01_A;

public class Chapter5_01 {

    public static void main(String[] args) {

        // Chapter5_01_Aクラスのインスタンスを生成
        Chapter5_01_A a = new Chapter5_01_A();
        // 別の変数に異なるインスタンスを保持することも出来る。
        Chapter5_01_A a2 = new Chapter5_01_A();

        // Chapter5_01_Bクラスのインスタンスを生成
        // Chapter5_01_Bクラス同じパッケージにあるのでimportが不要
        Chapter5_01_B b = new Chapter5_01_B();

    }

}
