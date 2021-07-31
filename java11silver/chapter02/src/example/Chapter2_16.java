package example;

public class Chapter2_16 {

    public static void main(String[] args) {

        // StringBuilder型変数を引数ありで初期化
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);

        // 文字列リテラルを+結合した場合
        System.out.println("abc" + "def");
        /* コンパイルされるとこうなっている
        System.out.println("abcdef");
        （リテラル文字はstatic変数は実行時に結合されるのでなく
        コンパイル時に結合される（参照しない）為、無駄にメモリ消費することはない）*/

    }

}
