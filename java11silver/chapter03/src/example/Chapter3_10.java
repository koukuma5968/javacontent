package example;

public class Chapter3_10 {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("一つ目のループ");
        // 10未満の間繰り返す
        while (i < 10) {
            System.out.println(i++);
        }

        System.out.println("二つ目のループ");
        // 変数iはすでに10に達しているのでブロック内の処理は実行されない
        while (i < 10) {
            System.out.println(i++);
        }
    }
}
