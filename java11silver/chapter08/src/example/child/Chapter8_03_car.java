package example.child;

import example.abstracts.Chapter8_03_abstract;

public class Chapter8_03_car extends Chapter8_03_abstract {
    public Chapter8_03_car() {
        this.name = "車";
        this.flightsNum = 4;
    }
    @Override
    public void drive() {
        System.out.println("ペダルを踏む");
    }
    public void drift() {
        System.out.println("ドリフト");
    }
}
