package example;

import java.lang.reflect.InvocationTargetException;

public class Chapter10_02 {

    public static void main(String[] args) {

        try {
            // 存在しないクラス名からインスタンスを生成する。
            Class.forName("example.Chapter10_02_B").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException
                | SecurityException e) {
            e.printStackTrace();
        }
    }
}