package ClassLoadTest;

import util.OutUtil;

public class InitTest {
	public static void main(String[] args) {
//		Father[] cArray = new Father[8];
//		OutUtil.print(((Integer)(Father.T)).toString());
//		Father.staticShow();
		OutUtil.print(Child.str);
//		Father.staticShow();

		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
	}
}
