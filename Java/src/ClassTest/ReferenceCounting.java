package ClassTest;

import util.OutUtil;

import java.io.FilterInputStream;

/**
 * Created by Ziyun on 2016/8/30.
 */

//  Thinking in Java P161 利用引用计数跟踪共享变量的引用对象数
public class ReferenceCounting {
    public static void main(String[] args) {
        Compose[] composes = new Compose[5];
        Share s = new Share();
        for (int i = 0; i < 5; ++i){
            composes[i] = new Compose(s);
        }
        for (int i = 0; i < 5; ++i){
            composes[i].dispose();
        }
    }
}

class Share {
    private int refCount = 0;       // 引用计数器
    private static long counter = 0; // 利用counter和id记录当前创建的Share实例数
    private final long id = counter++;

    public Share() {
        OutUtil.print(this.toString());
    }

    public void addRef() {
        refCount++;
    }

    public void dispose() {
        // 方法内部需要将引用计数减1
        if (--refCount == 0) {
            OutUtil.print("dispose " + this);
        }
    }

    @Override
    public String toString() {
        return "Share " + id;
    }
}

class Compose {
    private Share share;
    private static long counter = 0;
    private final long   id = counter++;

    public Compose(Share share) {
        this.share = share;
        share.addRef();     // 创建一个新对象时，需要将共享变量的引用计数加1
        OutUtil.print(this.toString());
    }

    public void dispose(){
        OutUtil.print("dispose " + this);
        share.dispose();
    }

    @Override
    public String toString() {
        return "Compose " + id;
    }
}
