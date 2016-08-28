package ClassLoadTest;

import util.OutUtil;

public class Child extends Father {

	// 非静态变量
	C ca = new C("ca");

	// 静态常量
	static final int T = 28;

	// 构造方法
	public Child() {
		super();
		OutUtil.print("Construct method in Child! ");
	}

	// 带参构造器
	public Child(String name) {
		OutUtil.print("Construct method in Child! " + "Name = " + name);
	}

	// 非静态代码块
	{
		OutUtil.print("Common blocks in Child! ");
	}

	// 静态方法
	static void staticShow() {
		OutUtil.print("Static method in Child! ");
	}

	// 非静态方法
	void show() {
		OutUtil.print("Common method in Child! ");
	}

	// 静态变量
	static C cb = new C("cb");

	// 静态语句块
	static {
		OutUtil.print("Static blocks 1 in Child! ");
	}

	// 静态语句块
	static {
		OutUtil.print("Static blocks 2 in Child! ");
	}

}
