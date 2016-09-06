package AccessTest2;

import AccessTest.ClassAccess;

/**
 * Created by Ziyun on 2016/9/6.
 */

public class AccessMain2 {
    public static void main(String[] args) {
        ClassAccess test3 = new ClassAccess();
        test3.publicMethod();
//      test3.protectedMethod();    // protectedMethod() has 'protected' access
//      test3.packageMethod();
// packageMethod() is not public, cannot be accessed from outside package
//      test3.privateMethod();  privateMethod() has 'private' access
    }
}
