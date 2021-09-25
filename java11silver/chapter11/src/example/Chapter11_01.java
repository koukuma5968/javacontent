package example;

import sub_module.Chapter11_01_print;

public class Chapter11_01 {

    public static void main(String[] args) {
    	// chapter11_submodモジュールの公開パッケージを利用
        Chapter11_01_print sub = new Chapter11_01_print();
        sub.print("モジュール・システムの利用");
    }
}