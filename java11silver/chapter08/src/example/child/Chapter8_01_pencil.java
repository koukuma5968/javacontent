package example.child;

import example.parent.Chapter8_01_Parent;
// Chapter8_01_Parentを継承
public class Chapter8_01_pencil extends Chapter8_01_Parent {
    public Chapter8_01_pencil() {
        super("鉛筆");
    }
    public void sharpen() {
        super.work("芯を削る");
    }
}
