package AccessTest;

/**
 * Created by Ziyun on 2016/9/6.
 */

public class AccessMain {

    public static void main(String[] args) {
        ClassAccess test1 = new ClassAccess();
        test1.publicMethod();
        test1.protectedMethod();
        test1.packageMethod();
       // test1.privateMethod();  privateMethod() has 'private' access

        AccessA test2 = new AccessA();
        test2.publicMethod();
        test2.protectedMethod();
        test2.packageMethod();
        // test2.privateMethod();  privateMethod() has 'private' access
    }
}
