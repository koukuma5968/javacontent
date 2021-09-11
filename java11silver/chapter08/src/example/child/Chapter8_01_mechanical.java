package example.child;

import example.parent.Chapter8_01_Parent;
//Chapter8_01_Parentを継承
public class Chapter8_01_mechanical extends Chapter8_01_Parent {
    public Chapter8_01_mechanical() {
        super("シャープペン");
    }
    public void exchange() {
        super.work("芯を交換する");
    }
}
