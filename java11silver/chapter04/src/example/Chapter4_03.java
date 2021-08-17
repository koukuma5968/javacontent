package example;

public class Chapter4_03 {

    public static void main(String[] args) {

        // new演算子を使用してもしなくても同じ
        int[] num = new int[] {0,1,2,3,4};
        int[] num2 = {0,1,2,3,4};

        // new演算子を使用した場合、要素数を指定できない
        int[] num3 = new int[5] {0,1,2,3,4};

        // 要素0で固定になるため意味はないが、指定しなくてもコンパイルエラーにはならない、
        int[] num4 = {};
    }

}
