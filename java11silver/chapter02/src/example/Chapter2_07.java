package example;

public class Chapter2_07 {

    public static void main(String[] args) {

        // 10進数の整数リテラルで初期化するとintとして扱われる
        var i = 1;
        System.out.println(i);

        // 文字リテラルならString
        var s = "文字列";
        System.out.println(s);

        // 値の変更は可能だが初期化値とは別の型を代入は出来ない
        s = "文字";
        s = 1l;

        // 初期化せず宣言のみはコンパイルエラーとなる
        var x;

        // nullでの初期化はコンパイルエラーとなる
        var n = null;

    }

    private void print() {

        // 利用可能範囲は通常のローカル変数と同様。
        System.out.println(i);

    }
}
