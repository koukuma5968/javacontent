package example.sub;

public enum ENUM {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    private int num;

    private ENUM(int num) {
        this.num = num;
    }

    public static ENUM getENUM(int num) {
        for (ENUM e : ENUM.values()) {
            if (e.num == num) {
                return e;
            }
        }
        return null;
    }
}
