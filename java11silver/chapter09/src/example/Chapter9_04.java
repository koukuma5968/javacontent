package example;

import java.util.ArrayList;
import java.util.List;

public class Chapter9_04 {

    public static void main(String[] args) {
        // ArrayListを用いたListインターフェースの利用
        List<String> list = new ArrayList<String>();
        list.add("list1");
        list.add("list2");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}