package example.sub;

public class Chapter6_05_A {

    // static変数
    public static String s = "static";
    // インスタンス変数
    public String instance = "インスタンス";

    // staticメソッド
    public static void print() {
        // staticメソッド内でインスタンス変数は参照できない
        System.out.println(instance);
        // インスタンスを生成すれば使える
        Chapter6_05_A a = new Chapter6_05_A();
        System.out.println(a.instance);
    }

    private void test() {
        // staticでないメソッドからのstatic変数の参照は可能
        System.out.println(instance);
    }
}
