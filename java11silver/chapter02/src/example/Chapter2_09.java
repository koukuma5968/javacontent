package example;

public class Chapter2_09 {

    public static void main(String[] args) {

        /* String型変数を宣言
           文字列のindexは
           abcde
           01234
           となる(indexは必ず0から始まる)*/
        String s = "abcde";
        System.out.println(s);

        // eを抜き出す場合、index4を指定する
        System.out.println(s.charAt(4));

        // 存在しないindexを指定すると実行時に例外が発生する
        System.out.println(s.charAt(5));

    }

}
