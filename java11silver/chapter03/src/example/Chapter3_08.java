package example;

import java.util.Random;

import example.sub.ENUM;

public class Chapter3_08 {

    public static void main(String[] args) {

        Random ran = new Random();
        int next = ran.nextInt(10);

        switch (ENUM.getENUM(next)) {

            case ONE :
                System.out.println("case1:乱数=" + next);
            case THREE :
                System.out.println("case3:乱数=" + next);
                break;
            case FIVE :
                System.out.println("case5:乱数=" + next);
            case TEN :
                System.out.println("case10:乱数=" + next);
                break;
            default:
                System.out.println("default:乱数=" + next);
                break;
        }

    }

}
