package ClassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/30.
 */

public class MultiType {
    // Thinking in Java P156 域和静态方法的多态性
    // 输出为：
    /*String in Super
      staticf() in Super
      commonf() in Sub
    */
    //由此可见，域和静态方法不具备多态特性
    public static void main(String[] args) {
        Super sup = new Sub();
        OutUtil.print(sup.ss);
        sup.staticf();
        sup.commonf();
    }
}

class Super{
    String ss = "String in Super";
    static void staticf(){
        OutUtil.print("staticf() in Super");
    }
    void commonf(){
        OutUtil.print("commonf() in Super");
    }
}

class Sub extends Super{
    String ss = "String in Sub";
    static void staticf(){
        OutUtil.print("f() in Sub");
    }
    void commonf(){
        OutUtil.print("commonf() in Sub");
    }
}
