package example;

import java.util.Arrays;
import java.util.List;

public class Chapter3_12 {

    public static void main(String[] args) {

        // 配列を初期化
        String[] str = {"A","B","C","D"};
        // 要素分繰り返す
        for (String s : str) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
        // List型（コレクション）を初期化
        List<String> strlist = Arrays.asList("E","F","G");
        for (String s : strlist) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
