package inter;
// 複数継承したインターフェースを実装することで継承した抽象メソッドをすべてを実装する
public class Chapter9_03_impl implements Chapter9_03_parent {
    // Chapter9_01_interfaceのメソッド
    @Override
    public String name() {
        return "kindle";
    }
    // Chapter9_01_interfaceのメソッド
    @Override
    public void startup() {
        System.out.println("起動");
    }
    // Chapter9_03_interfaceのメソッド
    @Override
    public String settings() {
        return "設定";
    }
    // Chapter9_03_parentのメソッド
    @Override
    public String update() {
        return "更新";
    }
}
