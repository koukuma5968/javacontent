package example;

public class Chapter4_08 {

    public static void main(String[] args) {

        // 2次元配列を初期化
        String[][] strs = {{"A","B"},{"a","b","c","d"}};
        // index0の配列のindex1を表示
        System.out.println(strs[0][1]);

        // 拡張for（for-each）を使用してすべての要素を表示
        System.out.println("---拡張forで表示---");
        for (String[] str : strs) {
            for (String s : str) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
