package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Chapter10_01 {

    public static void main(String[] args) {

        try {
            // 存在する場合
            URL file = Chapter10_01.class.getResource("./file.txt");
            // ファイルを読み込む
            BufferedReader br = new BufferedReader(new InputStreamReader(file.openStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        // ファイルが存在しない、破損、他のプロセスが読み込んでいる場合など
        // プログラムに起因しない例外をキャッチし、障害内容を出力する。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}