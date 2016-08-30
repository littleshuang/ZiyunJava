package InheritInner;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 * Thinking in Java P213
 */

class Egg {
    class Yolk {
        public Yolk() {
            OutUtil.print("Egg.Yolk()");
        }

        public void f() {
            OutUtil.print("Egg.Yolk().f()");
        }
    }

    private Yolk y = new Yolk();

    public Egg() {
        OutUtil.print("New Egg()");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}

public class BigEgg extends Egg {
    public class Yolk extends Egg.Yolk{
        public Yolk(){
            OutUtil.print("BigEgg.Yolk()");
        }
        public void f(){
            OutUtil.print("BigEgg.Yolk().f()");
        }
    }

    public BigEgg(){
        OutUtil.print("New BigEgg()");
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg e = new BigEgg();
        e.g();
    }
}
