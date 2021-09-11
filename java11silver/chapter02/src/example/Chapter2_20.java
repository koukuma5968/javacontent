package example;

public class Chapter2_20 {

    public static void main(String[] args) {
        // 暗黙型キャスト
        // byte型を初期化
        byte a = 0x1;
        // short型に代入
        short b = a;
        // long型に代入
        long c = a;

        // 明示的キャスト
        // double型を初期化
        double d = 10.1d;
        // int型に代入
        int e = (int) d;
        // byte型に代入
        byte f = (byte) d;
    }

}
