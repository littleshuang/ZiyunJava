package InheritInner;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class InheritMain {

    // Thinking in Java P212 内部类的继承，继承自内部类的类必须在构造函数中持有外部类的引用
    // 并通过外部类来初始化该类，即 wi.super()一句
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner in = new InheritInner(wi);

        // Thinking in Java P212 练习26
        // 注意Inner2实例化方法的书写，如果没有使用wi2就无法通过编译
        WithInner2 wi2 = new WithInner2();
        WithInner2.Inner2 inner2 = wi2.new Inner2(wi, "Hello");
    }
}
