package ClassLoadTest;

import util.OutUtil;

public class Father {
	// 非静态变量
	C fa = new C("fa");

	public static String str = "str in Father";

	// 静态变量
	static C fb = new C("fb");

	// 静态语句块
	static {
		OutUtil.print("Static blocks 1 in Father! ");
	}

	// 静态语句块
	static {
		OutUtil.print("Static blocks 2 in Father! ");
	}

	// 静态常量
	static final int T = 28;

	// 构造方法
	public Father() {
		super();
		OutUtil.print("Construct method in Father! ");
	}

	// 带参构造器
	public Father(String name) {
		OutUtil.print("Construct method in Father! " + "Name = " + name);
	}

	// 非静态代码块
	{
		OutUtil.print("Common blocks in Father! ");
	}

	// 静态方法
	static void staticShow() {
		OutUtil.print("Static method in Father! ");
	}

	// 非静态方法
	void show() {
		OutUtil.print("Common method in Father! ");
	}

}
