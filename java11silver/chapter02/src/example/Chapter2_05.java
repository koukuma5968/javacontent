package example;

public class Chapter2_05 {

    // インスタンス変数を宣言
    int instance;

    public static void main(String[] args) {

        // インスタンス化後、利用可能になる
        Chapter2_05 ob = new Chapter2_05();
        System.out.println(ob.instance);

        ob.print();

        // staticメソッドからはインスタンス生成せずに使用は出来ない
        System.out.println(instance);

    }

    private void print() {

        // クラス内の非staticメソッド内からは直接参照できる。
        System.out.println(instance);

        int instance = 1;
        /* 自身のオブジェクトであることを示すthisを付けることで
           ローカル変数と区別出来る。 */
        System.out.println(this.instance);
    }
}
