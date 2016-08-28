package ClassLoadTest;

import util.OutUtil;

public class InitTest {
	public static void main(String[] args) {
//		Father[] cArray = new Father[8];
//		OutUtil.print(((Integer)(Father.T)).toString());
//		Father.staticShow();
		OutUtil.print(Child.str);
//		Father.staticShow();
	}
	
	class test{
		static final int A = 8;
		static final int B = A * 8;
	}
}
