package example.child;

import example.abstracts.Chapter8_02_abstract;
// Chapter8_02_abstractを継承
public class Chapter8_02_motorcycle extends Chapter8_02_abstract {
    public Chapter8_02_motorcycle() {
        this.name = "バイク";
        this.flightsNum = 1;
    }
    // abstractで修飾されたメソッドを実装し、サブクラス固有の処理を実装する
    @Override
    public void drive() {
        System.out.println("グリップを回す");
    }
}
