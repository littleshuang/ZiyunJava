package Exception;

import util.OutUtil;

class Exception1 extends Exception{}

class Exception2 extends Exception1{}

class Exception3 extends Exception2{}

class A{
    public void f() throws Exception1{
        throw new Exception1();
    }
}

class B extends A{
    @Override
    public void f() throws Exception2{
        throw new Exception2();
    }
}

class C extends B{
    @Override
    public void f() throws Exception3{
        throw new Exception3();
    }
}

public class InheritException {
    public static void main(String[] args) {
        A c = new C();
        try {
            c.f();
        }catch (Exception e){
            OutUtil.print(e.getClass().getSimpleName());
        }
    }
}
