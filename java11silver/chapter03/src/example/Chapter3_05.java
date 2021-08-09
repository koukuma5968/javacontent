package example;

public class Chapter3_05 {

    public static void main(String[] args) {

        boolean boolA = true;
        boolean boolB = false;

        // 左辺と右辺の両方がtrueであればtrue
        // &と&&の違いは右辺を評価するかどうか
        // 左辺がtrueの場合はどちらも右辺を評価する
        System.out.println(boolA &
                boolB);
        System.out.println(boolA &&
                boolB);
        // 左辺がfalseの場合は&&は右辺を評価しない
        System.out.println(boolB &
                boolA);
        System.out.println(boolB &&
                boolA);

        // 左辺もしくは右辺のいずれかがtrueであればtrue
        System.out.println(boolA | boolB);
        System.out.println(boolA || boolB);

        // 値がtrueであればfalse、falseであればtrue
        System.out.println(!boolA);
        System.out.println(!boolB);

    }

}
