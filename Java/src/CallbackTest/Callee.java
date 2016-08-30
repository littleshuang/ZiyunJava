package CallbackTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class Callee {
    String name;

    public Callee(String name) {
        this.name = name;
    }

    public void doSome(Callback back, String work) {
        OutUtil.print("I now to do the work: " + work);
        OutUtil.print("I have finished the work, now notify the caller!");
        back.solve("Finished!");
    }
}
