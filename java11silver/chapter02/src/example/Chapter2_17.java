package example;

public class Chapter2_17 {

    public static void main(String[] args) {

        // StringBuilder型変数を初期化
        StringBuilder s = new StringBuilder();
        System.out.println(s);

        // "abc"を連結
        s.append("abc");
        System.out.println(s);

        // "efg"を連結
        s.append("efg");
        System.out.println(s);

        // 文字列リテラル以外を連結
        s.append(true);
        System.out.println(s);

    }

}
