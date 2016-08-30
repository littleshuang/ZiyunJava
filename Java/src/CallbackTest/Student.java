package CallbackTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class Student {
    String sName;

    public Student(String name) {
        sName = name;
    }

    void doWork(Teacher t, String str){
        OutUtil.print("Teacher assigned a work -- " + str + " to me, and I am going to do it!");
        OutUtil.print("Ok, I have finished it!");
        t.checkWork(this);
    }
}
