package example;

import java.util.Random;

public class Chapter3_07 {

    public static void main(String[] args) {

        Random ran = new Random();
        int next = ran.nextInt(10);

        switch (next) {

            case 1 :
                System.out.println("case1:乱数=" + next);
            case 3 :
                System.out.println("case3:乱数=" + next);
                break;
            case 5 :
                System.out.println("case5:乱数=" + next);
            case 10 :
                System.out.println("case10:乱数=" + next);
                break;
            default:
                System.out.println("default:乱数=" + next);
                break;
        }

    }

}
