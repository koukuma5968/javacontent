package example;

public class Chapter2_10 {

    public static void main(String[] args) {

        /* String型変数を宣言
           文字列のindexは
           abcde
           01234
           となる(indexは必ず0から始まる)*/
        String s = "abcde";
        System.out.println(s);

        // dを指定してindexを取得する
        System.out.println(s.indexOf('d'));

        // 文字列リテラルでも指定できる
        // この場合は文字列が含まれる先頭のindex（bのindex）が返却される
        System.out.println(s.indexOf("bc"));

        // 文字列として一部ではなく全部で検索する為、1文字でも違えば-1が返却される
        System.out.println(s.indexOf("abcdef"));

        // 存在しない文字は-1が返却される
        System.out.println(s.indexOf('f'));

        // 第２引数で検索の開始位置をしてもできる
        // その場合でも取得できるindexは文字列全体のindexになる
        System.out.println(s.indexOf('d', 3));

        // 開始位置が検索文字より後のindexで始めた場合は見つけられず-1になる
        System.out.println(s.indexOf('d', 3));
    }

}
