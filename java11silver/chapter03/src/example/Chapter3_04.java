package example;

public class Chapter3_04 {

    public static void main(String[] args) {

        int numA = 1;
        int numB = 2;

        // 左辺と右辺が等しければ真
        System.out.println(numA == numB);

        // 左辺と右辺が異なれば真
        System.out.println(numA != numB);

        // 左辺より右辺が小さければ真
        System.out.println(numA > numB);

        // 左辺と右辺が等しか、右辺が小さければ真
        System.out.println(numA >= numB);

        // 左辺より右辺が大きければ真
        System.out.println(numA < numB);

        // 左辺と右辺が等しか、右辺が大きければ真
        System.out.println(numA <= numB);

        // 左辺のオブジェクトが、右辺のクラスのインスタンスであれば真
        String str = "abc";
        System.out.println(str instanceof String);

    }

}
