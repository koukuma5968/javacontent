package example.sub;

public class Chapter6_02_A {

    private int num = 5;
    /*
     *  デフォルトコンストラクタ
     *  作成しない場合も以下と同様のコンストラクタが作成される
     */
    public Chapter6_02_A() {
    }
    // 引数をもつコンストラクタ
    public Chapter6_02_A(int num) {
        this.num = num;
    }
    public void print() {
        System.out.println(this.num);
    }
}
