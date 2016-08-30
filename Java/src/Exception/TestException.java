package Exception;

/**
 * Created by Ziyun on 2016/8/30.
 *
 * 这是这篇博客上（http://blog.csdn.net/hguisu/article/details/6155636）的一个例子
 * *还是有点难度的，可以拿来练练手！
 */

public class TestException {
    public TestException() {
    }

    boolean testEx() throws Exception {
        boolean ret = true;
        try {
            ret = testEx1();
        } catch (Exception e) {
            System.out.println("testEx, catch exception");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx1() throws Exception {
        boolean ret = true;
        try {
            ret = testEx2();
            if (!ret) {
                return false;
            }
            System.out.println("testEx1, at the end of try");
            return ret;
        } catch (Exception e) {
            System.out.println("testEx1, catch exception");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx1, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx2() throws Exception {
        boolean ret = true;
        try {
            int b = 12;
            int c;
            for (int i = 2; i >= -2; i--) {
                c = b / i;
                System.out.println("i=" + i);
            }
            return true;
        } catch (Exception e) {
            System.out.println("testEx2, catch exception");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx2, finally; return value=" + ret);
            return ret;     // 难点在这里，在finally语句块里面执行return语句，会导致之前 throw语句失效
        }
    }

    public static void main(String[] args) {
//        TestException testException1 = new TestException();
//        try {
//            testException1.testEx();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        int a = 6;
        int b = 0;
        try {
            System.out.println("a/b的值是：" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("程序出现异常，变量b不能为0。");
        }
        System.out.println("程序正常结束。");
}
}
