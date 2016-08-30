package InheritInner;

import static InheritInner.WithInner.*;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class InheritInner extends WithInner.Inner {

//    InheritInner(){}      编译通不过

    InheritInner(WithInner wi){
        wi.super();
    }
}
