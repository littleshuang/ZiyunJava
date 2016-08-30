package InheritInner;

import InnerclassTest.Inner2;
import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class WithInner2 {

     class Inner2 extends WithInner.Inner{

         Inner2(WithInner wi) {
             wi.super();
         }

        Inner2(WithInner wi, String str){
            wi.super();
            OutUtil.print(str + " in Inner2!");
        }
    }
}
