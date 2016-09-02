package ClassTest;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/30.
 */

final class FinalClass{
    int a = 8;
}

public class FinalTest {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        OutUtil.print(++fc.a);
    }
}
