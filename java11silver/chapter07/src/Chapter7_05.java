package example;

import example.definition.Chapter5_05_A;
import example.definition.Chapter5_05_C.Chapter5_05_protected;

public class Chapter5_05 {

    public static void main(String[] args) {
        // publicクラスはどこからでも参照可能
        Chapter5_05_A a = new Chapter5_05_A();
        // 修飾子なしは同一パッケージからしか参照できない
        Chapter5_05_B b = new Chapter5_05_B();
        // protectedは不可視となり参照できない
        Chapter5_05_protected c = new Chapter5_05_protected();
        // privateはクラス内のみでしか使用できない
        Chapter5_05_private d = new Chapter5_05_private();
    }
}

