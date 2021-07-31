package example;

public class Chapter2_13 {

    public static void main(String[] args) {

        // 半角英数で初期化
        String s = "abcde";
        System.out.println(s);

        // 文字数を取得
        System.out.println(s.length());

        // 全角文字で初期化
        String s2 = "ＡＢＣＤＥ";
        System.out.println(s2);

        // 全角文字（2バイト文字）でも文字数は同じ
        System.out.println(s2.length());

    }

}
