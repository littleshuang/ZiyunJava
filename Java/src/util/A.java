package util;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/5.
 */

public class A {
    String name;
    public A(String str){
        name = str;
        print(str);
    }

    @Override
    public String toString() {
        return "class A & the str is " + name;
    }
}
