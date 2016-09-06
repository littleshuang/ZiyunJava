package AccessTest2;

import AccessTest.ClassAccess;

/**
 * Created by Ziyun on 2016/9/6.
 */

public class Child extends ClassAccess {

    void testf(){
        super.publicMethod();
        super.protectedMethod();
//      super.packageMethod();
// packageMethod() is not public, cannot be accessed from outside package
//      super.privateMethod();  // privateMethod() has private access
    }
}
