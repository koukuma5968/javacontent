package example;

public class Chapter4_07 {

    public static void main(String[] args) {

        // 2次元配列を初期化
        String[][] str = {{"A","B"},{"a","b","c","d"}};
        // 2次元以降は後で初期化することも可能
        // ただしnew演算子によるインスタンス化が必要
        int[][] num = {null,null};
        num[0] = new int[] {0,5,7,8,9};
        num[1] = {4,5};
    }
}
