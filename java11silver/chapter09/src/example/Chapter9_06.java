package example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chapter9_06 {

    public static void main(String[] args) {
        // Runnableは引数も戻り値も持たないrunメソッド持つインターフェースです。
        Runnable runnable = () -> System.out.println("実行");
        runnable.run();

        // Supplier<T>は引数を持たず、戻り値を返すgetメソッド持つインターフェースです。
        Supplier<String> supplier = () -> "取得";
        System.out.println(supplier.get());

        // Consumer<T>は引数を渡し、戻り値を返さないacceptメソッド持つインターフェースです。
        Consumer<Long> consumer = (l) -> System.out.println(l);
        consumer.accept(10l);

        // Consumer<T>は引数を渡し、戻り値を返さないacceptメソッド持つインターフェースです。
        Function<Integer, String> function = (num) -> {
            if (1 == num) {
                return "OK";
            }
            return "NG";
        };
        System.out.println(function.apply(1));

        // Predicate<T>は引数を渡し、戻り値に論理型を返すtestメソッド持つインターフェースです。
        Predicate<String> predicate = (str) -> {
            return "OK".equals(str);
        };
        System.out.println(predicate.test("OK"));
    }
}