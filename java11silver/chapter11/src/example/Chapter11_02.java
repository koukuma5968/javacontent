package example;

import sub_module.child.Chapter11_01_calculation;

public class Chapter11_02 {

    public static void main(String[] args) {
    	// chapter11_submodモジュールの非公開パッケージは利用できない。
    	Chapter11_01_calculation sub = new Chapter11_01_calculation();
        sub.print("モジュール・システムの利用");
    }
}