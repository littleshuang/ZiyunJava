package ClassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/30.
 * <p>
 * Thinking in Java P156 子类覆盖基类的私有方法
 */

class Cycle extends Shape {
    void f() {
        OutUtil.print("I am the child class -- Cycle!");
    }
}

public class Shape {
    private void f() {
        OutUtil.print("I am the base class -- Shape!");
    }
    public static void main(String[] args) {
        Shape s = new Cycle();
        s.f();
    }
}
