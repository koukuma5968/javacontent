package example.child;

import example.abstracts.Chapter8_03_abstract;

public class Chapter8_03_motorcycle extends Chapter8_03_abstract {
    public Chapter8_03_motorcycle() {
        this.name = "バイク";
        this.flightsNum = 1;
    }
    @Override
    public void drive() {
        System.out.println("グリップを回す");
    }
    public void wheelie() {
        System.out.println("ウィリー");
    }
}
