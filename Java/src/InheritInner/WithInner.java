package InheritInner;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class WithInner {

    class Inner{
        Inner(){}
        Inner(String str){
            OutUtil.print(str + " in Inner!");
        }
    }
}
