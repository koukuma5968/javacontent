package inter;

public class Chapter9_01_impl implements Chapter9_01_interface {
    private boolean flg = false;
    // インターフェースのメソッドをオーバーライドしないとエラーとなる
    @Override
    public String name() {
        return "Android" + TYPE;
    }
    @Override
    public void startup() {
        flg = true;
    }
}