package inter;

public interface Chapter9_01_interface {
    /*	インターフェースに定義するフィールド変数は明示的に記述しなくても
     * 「static final」であるものとして扱われる*/
    public String TYPE = "デバイス";
    // 抽象メソッドの定義
    public String name();
    public void startup();
    // defaultで修飾することで具象メソッドも記載できる。
    public default boolean force_shutdown() {
        return true;
    };
}
