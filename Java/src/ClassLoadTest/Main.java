package ClassLoadTest;

import util.OutUtil;

public class Main {
	
	C ma = new C("ma");
	static C mb = new C("mb");
	
	public Main(){
		OutUtil.print("I am CallbackMain!");
	}
	
	static{	
		OutUtil.print(mb.getClass().getName());
	}
	
	public static void main(String[] args) {
		OutUtil.print("Main");
		Child child = new Child();
		child.show();
		OutUtil.print(C.A);
		OutUtil.print(C.showC());
	}
	
	static Child mc = new Child("mc");
}
