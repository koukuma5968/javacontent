package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Chapter10_03 {

    public static void main(String[] args) {
        try {
            // throwsがあるメソッドはキャッチかスローを強制させられる。
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 例外をメソッドで処理せず呼び出し元へスローする
    private static void readFile() throws IOException {
        URL file = Chapter10_01.class.getResource("./file2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file.openStream()));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}