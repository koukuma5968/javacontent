package example;

public class Chapter3_13 {

    public static void main(String[] args) {

        // 2次元配列を初期化
        String[][] strs = {{"A","B","C","D"},
                            {"E","F","G","H"},
                            {"W","X","Y","Z"}};
        // 1次元要素分繰り返す
        for (String[] str : strs) {
            // 2次元要素分繰り返す
            for (String s : str) {
                System.out.print(s);
                System.out.print(" ");
            }
        }

    }
}
