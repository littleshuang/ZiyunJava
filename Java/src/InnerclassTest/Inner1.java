package InnerclassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/28.
 */
public class Inner1 {
    static int a = 9;

    class myInner {
        String inner_name;
        int a = 8;

        myInner(String str) {
            inner_name = str;
        }

        Inner1 outer() {
            return Inner1.this;     // 通过内部类引用外部类
        }
    }

    myInner inner() {
        myInner inner1 = this.new myInner("myInner in Inner1");
        inner1.a++;
        return inner1;
    }

    public static void main(String[] args) {
        Inner1 outer = new Inner1();
        Inner1.myInner inner = outer.new myInner("new myInner");    // 通过外部类创建内部类对象
        Inner1 outer1 = inner.outer();
        OutUtil.print(inner.inner_name);
        OutUtil.print(outer1.inner().inner_name);
    }
}
