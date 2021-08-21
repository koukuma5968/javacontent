package example.sub;

public class Chapter6_01_A {

    // 引数にString型変数を受け取り、戻り値にString型変数を返すメソッド
    public String addString(String str) {
        return str + " test";
    }
    // 戻り値を返さないメソッド
    public void print(int num) {
        System.out.println(num);
        // voidでもreturnによってメソッドを中断することも出来る
        return;
    }
}
