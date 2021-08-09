package example;

import java.time.LocalDateTime;

public class Chapter3_06 {

    public static void main(String[] args) {

        int second = LocalDateTime.now().getSecond();

        // 現在秒を判定
        if (second >= 30) {
            // 条件に一致した場合
            System.out.println("30秒以降:" + second);
        } else {
            // 条件に一致しない場合
            System.out.println("30秒未満:" + second);
        }

        // 現在秒を判定
        if (second < 10) {
            // 条件に一致した場合
            System.out.println("10秒未満:" + second);
        } else if (second < 30) {
            // 第二条件にのみ一致する場合
            System.out.println("10秒以上かつ30秒未満:" + second);
        } else if (second < 40) {
            // 第三条件にのみ一致する場合
            System.out.println("30秒以上かつ40秒未満:" + second);
        } else {
            // 条件に一致しない場合
            System.out.println("30秒以上:" + second);
        }

    }

}
