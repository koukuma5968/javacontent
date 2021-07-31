package example;

public class Chapter2_06_01 {

    // static変数を宣言
    static int st;

    public static void main(String[] args) {

        // インスタンス化しても利用可能だが、staticアクセスするよう警告される。
        Chapter2_06_01 ob = new Chapter2_06_01();
        System.out.println(ob.st);

        ob.print();

        // インスタンス生成せずに直接参照できる。
        System.out.println(st);

        // インスタンス化しても利用可能だが、staticアクセスするよう警告される。
        Chapter2_6_2 ob2 = new Chapter2_6_2();
        ob2.print();

    }

    private void print() {

        // インスタンス化後のメソッド内からでも直接参照できる。
        System.out.println(st);

    }
}
