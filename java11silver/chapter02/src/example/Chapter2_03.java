package example;

public class Chapter2_03 {

    public static void main(String[] args) {

        System.out.println("論理値");
        System.out.println("--------");
        // 真偽リテラル
        boolean b = true;
        System.out.println(b);
        System.out.println("--------");

        System.out.println("文字");
        System.out.println("--------");
        // 文字リテラル
        char c = 'c';
        System.out.println(c);
        System.out.println("--------");

        System.out.println("符号付整数（8ビット）");
        System.out.println("--------");
        // 10進数の整数リテラル
        byte by = 123;
        System.out.println(by);
        // 8進数の整数リテラル（先頭に0をつける）
        byte by2 = 040;
        System.out.println(by2);
        // 16進数の整数リテラル（先頭に0xまたは0Xをつける）
        byte by3 = 0x20;
        System.out.println(by3);
        // 2進数の整数リテラル（先頭に0bまたは0Bをつける）
        byte by4 = 0b0101;
        System.out.println(by4);
        System.out.println("--------");

        System.out.println("符号付整数（16ビット）");
        System.out.println("--------");
        // 10進数の整数リテラル
        short s = 123;
        System.out.println(s);
        // 8進数の整数リテラル（先頭に0をつける）
        short s2 = 040;
        System.out.println(s2);
        // 16進数の整数リテラル（先頭に0xまたは0Xをつける）
        short s3 = 0x20;
        System.out.println(s3);
        // 2進数の整数リテラル（先頭に0bまたは0Bをつける）
        short s4 = 0b0101;
        System.out.println(s4);
        // 10進数の整数リテラルと同様（アンダースコアで区切ることが可能）
        short s5 = 12_345;
        System.out.println(s5);
        System.out.println("--------");

        System.out.println("符号付整数（32ビット）");
        // 10進数の整数リテラル
        int i = 123;
        System.out.println(i);
        // 8進数の整数リテラル（先頭に0をつける）
        int i2 = 040;
        System.out.println(i2);
        // 16進数の整数リテラル（先頭に0xまたは0Xをつける）
        int i3 = 0x20;
        System.out.println(i3);
        // 2進数の整数リテラル（先頭に0bまたは0Bをつける）
        int i4 = 0b0101;
        System.out.println(i4);
        // 10進数の整数リテラルと同様（アンダースコアで区切ることが可能）
        int i5 = 12_345;
        System.out.println(i5);
        System.out.println("--------");

        System.out.println("符号付整数（64ビット）");
        // 10進数の整数リテラル
        long l = 123;
        System.out.println(l);
        // 8進数の整数リテラル（先頭に0をつける）
        long l2 = 040;
        System.out.println(l2);
        // 16進数の整数リテラル（先頭に0xまたは0Xをつける）
        long l3 = 0x20;
        System.out.println(l3);
        // 2進数の整数リテラル（先頭に0bまたは0Bをつける）
        long l4 = 0b0101;
        System.out.println(l4);
        // 10進数の整数リテラルと同様（アンダースコアで区切ることが可能）
        long l5 = 12_345;
        System.out.println(l5);
        System.out.println("--------");


        // 浮動小数点（32ビット）
        float f;

        // 浮動小数点（64ビット）
        double d;

    }

}
