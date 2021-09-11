package example.abstracts;

public abstract class Chapter8_03_abstract {
    protected String name;
    protected int flightsNum;
    public void runEngine() {
        System.out.println(name + ":エンジンを起動");
    }
    public abstract void drive();
}
