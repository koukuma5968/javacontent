package example;

import example.child.Chapter8_01_mechanical;
import example.child.Chapter8_01_pencil;

public class Chapter8_01 {

    public static void main(String[] args) {
        // サブクラスのインスタンスを生成
        Chapter8_01_pencil pencil = new Chapter8_01_pencil();
        // サブクラスのメソッドを実行
        pencil.sharpen();
        // スーパークラスのメソッドを実行
        pencil.write("図");
        // サブクラスのインスタンスを生成
        Chapter8_01_mechanical mechanical = new Chapter8_01_mechanical();
        // サブクラスのメソッドを実行
        mechanical.exchange();
        // スーパークラスのメソッドを実行
        mechanical.write("絵");
    }
}