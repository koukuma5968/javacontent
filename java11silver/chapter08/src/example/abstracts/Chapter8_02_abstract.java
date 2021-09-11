package example.abstracts;

public abstract class Chapter8_02_abstract {
    protected String name;
    protected int flightsNum;
    public void runEngine() {
        System.out.println("エンジンを起動");
    }
    public abstract void drive();
}
