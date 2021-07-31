package example;

public class Chapter2_11 {

    public static void main(String[] args) {

        /* String型変数を宣言
           文字列のindexは
            a b c d e
            0 1 2 3 4
           0 1 2 3 4 5
           indexとは違うことに注意*/
        String s = "abcde";
        System.out.println(s);

        // index1から3の文字を取得する
        System.out.println(s.substring(1, 4));

        // 開始位置のみ指定した場合、開始位置以降の文字がすべて返却される
        System.out.println(s.substring(2));

        // すべての文字列を切り出したい場合は0,5を指定する必要がある
        System.out.println(s.substring(0,5));

        // 存在しない位置まで指定すると実行時例外となる
        System.out.println(s.substring(2, 6));

        // 開始と終了を同じにすると1文字切り出すのではなく実行時例外となる
        // 「2,3」と指定しないと1文字「c」を切り出すことはできない
        System.out.println(s.substring(2, 2));
    }

}
