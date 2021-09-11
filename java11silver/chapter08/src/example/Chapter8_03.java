package example;

import example.abstracts.Chapter8_03_abstract;
import example.child.Chapter8_03_car;
import example.child.Chapter8_03_motorcycle;

public class Chapter8_03 {

    public static void main(String[] args) {
        // 抽象クラスの型が引数のメソッドにサブクラスインスタンスを渡す
        run(new Chapter8_03_car());
        run(new Chapter8_03_motorcycle());
    }
    private static void run(Chapter8_03_abstract vehicle) {
        // 抽象クラスで定義された同名メソッドの呼び出し
        vehicle.runEngine();
        // オーバーライドしたメソッドの呼び出し
        vehicle.drive();
        if (vehicle instanceof Chapter8_03_car) {
            // サブクラスへキャスト
            Chapter8_03_car car = (Chapter8_03_car) vehicle;
            // サブクラス固有のメソッド
            car.drift();
        } else {
            Chapter8_03_motorcycle motorcycle = (Chapter8_03_motorcycle) vehicle;
            motorcycle.wheelie();
        }
    }
}