package example;

public class Chapter2_15 {

    public static void main(String[] args) {

        // String型変数を宣言
        String s = "abcde";
        System.out.println(s);

        // "fgh"を後ろに結合
        System.out.println(s.concat("fgh"));

        // "fgh"を+結合
        System.out.println(s + "abc");

        // 整数リテラルと結合
        System.out.println(s + 1234);

        // 文字リテラルの後ろに結合
        System.out.println("xyz".concat(s));

        // 元のオブジェクトは変化しない
        System.out.println(s);

        // +=で結合結果を代入
        s += "ijk";
        System.out.println(s);
    }

}
