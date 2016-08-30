package InnerclassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */

interface Dancable<T> {

    T dance();

    class Dancer{
        String name;

        {
            OutUtil.print("Hello!");
        }

        Dancer(String str){
            this.name = str;
            OutUtil.print("I am a dancer, and my name is " + name);
        }

        String getName(){
            return name == null ? "I don't have a name now!" : name;
        }

    }
}
