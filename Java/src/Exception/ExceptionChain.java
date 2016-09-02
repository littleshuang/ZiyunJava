package Exception;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/30.
 */

public class ExceptionChain {
    private static class Exception1 extends Exception {
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i <= a.length; ++i) {
            try {
                if (i >= a.length) {
                    throw new Exception1();
                }
                a[i] = i * i;
                OutUtil.print(a[i] + "");
            }catch (Exception1 e){
                e.initCause(new ArrayIndexOutOfBoundsException(i));
                e.printStackTrace(System.out);
            }
        }
    }
}
