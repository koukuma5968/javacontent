package example;

public class Chapter2_08 {

    public static void main(String[] args) {

        // 文字列リテラルを指定して宣言
        String s = "初期化";
        System.out.println(s);

        // オブジェクト型なのでインスタンス生成して初期化可能
        // この場合初期値は""(空文字)になる
        String s1 = new String();
        System.out.println(s1);

        // コンストラクタに初期値を渡してもOK
        String s2 = new String("コンストラクタ");
        System.out.println(s2);

        // nullで宣言も出来る
        // この場合オブジェクトがnull
        String s3 = null;
        // これだと実行時に例外が発生する
        System.out.println(s3.toString());

    }

}
