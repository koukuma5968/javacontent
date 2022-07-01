package example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// ターゲットをメソッドのみする
@Target(ElementType.METHOD)
public @interface Chapter17_07_B {
}

