package example;

public class Chapter2_12 {

    public static void main(String[] args) {

        // String型変数を宣言
        String s = "abcde";
        System.out.println(s);

        // bcをfgに置き換え
        System.out.println(s.replace("bc", "fg"));

        // 文字リテラルの置き換えも可能
        System.out.println(s.replace('d', 'x'));

        // 存在しない文字は置き換わらない
        System.out.println(s.replace("fg", "xy"));

        // 文字が存在しても文字列で検索するので置き換えはされない
        System.out.println(s.replace("ae", "xy"));

        // 元のオブジェクト参照は置き換えられない
        System.out.println(s);
    }

}
