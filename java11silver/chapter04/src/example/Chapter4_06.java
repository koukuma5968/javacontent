package example;

public class Chapter4_06 {

    public static void main(String[] args) {

        // 2次元配列をインスタンス化
        String[][] str = new String[5][3];
        // 2次元目以降の要素数を指定せずインスタンス化
        int num[][][] = new int[10][][];
        // 要素数は間を飛ばしての指定は出来ない。
        char[][][] c = new char[8][][4];
    }
}
