package example;

// Chapter7_01_A.jarにあるクラス
import interfarce.example.sub.Chapter7_01_A;

public class Chapter7_01 {

    public static void main(String[] args) {
        Chapter7_01_A a = new Chapter7_01_A();
        // publicメソッドを通してcountの値を取得
        System.out.println(a.getCount());
        // カウントアップ
        a.up();
        a.up();
        System.out.println(a.getCount());
        // カウントダウン
        a.down();;
        System.out.println(a.getCount());
    }
}

