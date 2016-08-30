package CallbackTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class Teacher {
    String tName;

    public Teacher(String tName) {
        this.tName = tName;
    }

    void assignWork(Student s, String work){
        OutUtil.print("I will assign a work to " + s.sName);
        s.doWork(this, work);
    }

    void checkWork(Student s){
        OutUtil.print("Ok, " + s.sName + "'work has been checked!");
    }
}
