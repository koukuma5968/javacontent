package example.parent;

public class Chapter8_01_Parent {
    protected String name;
    public Chapter8_01_Parent(String name) {
        this.name = name;
    }
    public void write(String action) {
        System.out.println(action + "γζΈγγ");
    }
    protected void work(String action) {
        System.out.println(action);
    }
}
