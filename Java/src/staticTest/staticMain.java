package staticTest;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/5.
 */

public class staticMain {

    public static void main(String[] args) {
        staticTest.staticMethod();      // 直接通过类名访问静态方法
        print(staticTest.staticb);      // 直接通过类名访问静态变量
        print(staticTest.STATIC_D);

        // staticTest.a; 提示 non-static field 'a' cannot be referenced from a static context
        // 非静态方法必须通过实例访问
        staticTest test = new staticTest();
        print(test.a);
    }
}
