package InnerclassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class Inner2 implements Dancable<Dancable.Dancer>{
    // Thinking in Java P203 exercise 20
    // 创建一个包含嵌套类的接口，实现该接口并创建嵌套类实例

    @Override
    public Dancer dance() {
        return new Dancer("Anna");
    }

    public static void main(String[] args) {
        Dancer hellen = new Dancer("Hellen");
        OutUtil.print(hellen.getName());
        new Inner2().dance();
    }
}
