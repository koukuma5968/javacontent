package example.sub;

public class Chapter6_04_A {

    // String型を引数に持つ
    public void print(String str) {
        System.out.println(str);
    }

    // 数値型を引数に持つ
    public void print(int num) {
        System.out.println(num);
    }

    // String型と数値型を引数に持つ
    public void print(String str, int num) {
        print(str);
        print(num);
    }
}
