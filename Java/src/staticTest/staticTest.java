package staticTest;

import util.A;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/5.
 */

public class staticTest {
    private static A statica = new A("private static");
    public static A staticb = new A("public static");
    private static final A STATIC_C = new A("private static final");
    public static final A STATIC_D = new A("public static final");

    public int a = 8;

    static {
        print("static block in staticTest");
        // a++; 提示 non-static field 'a' cannot be referenced from a static context
    }

    static void staticMethod(){
        print("static method in staticTest");
        // a++; 提示 non-static field 'a' cannot be referenced from a static context
    }

}
