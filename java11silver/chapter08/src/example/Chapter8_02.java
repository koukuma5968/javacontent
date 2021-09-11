package example;

import example.child.Chapter8_02_car;
import example.child.Chapter8_02_motorcycle;

public class Chapter8_02 {

    public static void main(String[] args) {
        // サブクラスのインスタンスを生成
        Chapter8_02_car car = new Chapter8_02_car();
        // 抽象クラスのメソッドを実行
        car.runEngine();
        // サブクラスのメソッドを実行
        car.drive();
        // サブクラスのインスタンスを生成
        Chapter8_02_motorcycle motorcycle = new Chapter8_02_motorcycle();
        // 抽象クラスのメソッドを実行
        motorcycle.runEngine();
        // サブクラスのメソッドを実行
        motorcycle.drive();
    }
}