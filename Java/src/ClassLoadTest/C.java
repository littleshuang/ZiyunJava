package ClassLoadTest;

import util.OutUtil;

public class C {
	public static final String A = "A in C";
	
	public static String showC() {
		return "showC method in C!";
	}
	
	public C(){
		OutUtil.print("Construct method in C!");
	}
	
	public C(String msg){
		OutUtil.print("Construct method in C! " + msg);
	}
}
