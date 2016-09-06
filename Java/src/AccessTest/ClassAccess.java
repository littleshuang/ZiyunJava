package AccessTest;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/6.
 */

public class ClassAccess {

    public ClassAccess() {
        print("public AccessA");
    }

    public void publicMethod(){
        print("public method in ClassAccess");
    }

    void packageMethod(){
        print("package method in ClassAccess");
    }

    protected void protectedMethod(){
        print("protected method in ClassAccess");
    }

    private void privateMethod(){
        print("private method in ClassAccess");
    }
}

class AccessA{

    public class classA{}
    protected class classB{}
    class classC{}
    private class classD{}

    public AccessA() {
        print("public AccessA");
    }

    public void publicMethod(){
        print("public method in AccessA");
    }

    void packageMethod(){
        print("package method in AccessA");
    }

    protected void protectedMethod(){
        print("protected method in AccessA");
    }

    private void privateMethod(){
        print("private method in AccessA");
    }
}

// 用 protected 或 private 修饰类时会提示
// modifier 'protected'或 'private' not allowed here
//private class AccessB{
//    public AccessB() {
//        print("public AccessB");
//    }
//}