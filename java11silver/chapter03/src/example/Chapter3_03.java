package example;

public class Chapter3_03 {

    public static void main(String[] args) {

        int numA = 1;

        // 1を加算する（インクリメント演算）
        // 演算が先に実行される（前置演算）
        System.out.println(++numA);

        // 1を加算する（インクリメント演算）
        // 現在の値が出力され、演算が実行される（後置演算）
        System.out.println(numA++);
        // インクリメント後
        System.out.println(numA);

        // 1を減算する（デクリメント演算）
        // 演算が先に実行される（前置演算）
        System.out.println(--numA);

        // 1を減算する（デクリメント演算）
        // 現在の値が出力され、演算が実行される（後置演算）
        System.out.println(numA--);
        // インクリメント後
        System.out.println(numA);

    }

}
