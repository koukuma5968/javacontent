package example;

public class Chapter3_14 {

    public static void main(String[] args) {

        // 2次元配列を初期化
        String[][] strs = {{"A","B","C","D"},
                            {"E","F","G","H"},
                            {"W","X","Y","Z"}};
        for (String[] str : strs) {
            int index = -1;
            for (String s : str) {
                index++;
                // 2つ目の要素以降を処理しない
                if (index == 2) break;
                System.out.print(s);
                System.out.print(" ");
            }
        }
        System.out.println();
        for (String[] str : strs) {
            int index = -1;
            for (String s : str) {
                index++;
                // 2つ目の要素のみ処理しない
                if (index == 2) continue;
                System.out.print(s);
                System.out.print(" ");
            }
        }
        System.out.println();
        // ラベルを付けることでbreakする位置を変更出来る。
        label:
        for (String[] str : strs) {
            for (String s : str) {
                // Gが出たら指定したラベル位置まで中断する
                if (s.equals("G")) break label;
                System.out.print(s);
                System.out.print(" ");
            }
        }
    }
}
