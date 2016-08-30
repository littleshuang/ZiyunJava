package CallbackTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class Caller implements Callback{

    Callee callee;

    public Caller(Callee c) {
        this.callee = c;
    }

    @Override
    public void solve(String result) {
        OutUtil.print("The result is " + result);
    }

    public void assign(String work){
        OutUtil.print("I assign a work -- " + work + " to " + callee.name);
        callee.doSome(this, work);
    }

}
