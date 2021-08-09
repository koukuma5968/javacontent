package example;

public class Chapter3_11 {

    public static void main(String[] args) {

        // 10未満の間繰り返す
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        // 変数はfor文の外で初期化してもよい
        int i = 0;
        // 初期化は記載しない
        for (; i < 5; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        // 更新処理も省略できる
        for (; i < 10;) {
            System.out.print(i++);
            System.out.print(" ");
        }
    }
}
