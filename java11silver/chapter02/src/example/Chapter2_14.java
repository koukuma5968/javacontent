package example;

public class Chapter2_14 {

    public static void main(String[] args) {

        // String型変数を宣言
        String s = "abcde";
        System.out.println(s);

        // "a"で始まるかどうか
        System.out.println(s.startsWith("a"));

        // "abc"で始まるかどうか
        System.out.println(s.startsWith("abc"));

        // "cd"で始まるかどうか
        System.out.println(s.startsWith("cd"));

        // 指定したindex（第2引数）から"cd"で始まるかどうか
        System.out.println(s.startsWith("cd", 2));

        // "de"で終わるかどうか
        System.out.println(s.endsWith("de"));

    }

}
