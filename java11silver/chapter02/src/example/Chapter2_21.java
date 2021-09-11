package example;

public class Chapter2_21 {

    public static void main(String[] args) {
        // byte型を初期化
        byte a = 0x1;
        // short型を初期化
        short b = 2;
        // byteとshortで演算しbyte型に代入
        byte c = (byte) (a + b);
        System.out.println(c);
        // byteとshortで演算しshort型に代入
        // intで扱われる為、キャストが必要
        short d = (short) (a + b);
        System.out.println(d);

        // long型を初期化
        long a2 = 0x2;
        // int型を初期化
        int b2 = 2;
        // int型に演算結果代入
        int c2 = (int) (a2 + b2);
        System.out.println(c2);
        // long型に演算結果代入
        long d2 = a2 + b2;
        System.out.println(d2);
    }

}
