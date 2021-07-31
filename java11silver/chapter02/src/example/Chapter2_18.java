package example;

public class Chapter2_18 {

    public static void main(String[] args) {

        // StringBuilder型変数を初期化
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);

        // "cd"を"zx"に置き換え
        System.out.println(s.replace(2, 4, "zx"));

    }

}
