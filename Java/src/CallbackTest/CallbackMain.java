package CallbackTest;

/**
 * Created by Ziyun on 2016/8/29.
 */
public class CallbackMain {

    public static void main(String[] args) {
//        Teacher teacher = new Teacher("Wang");
//        Student anna = new Student("Anna");
//
//        teacher.assignWork(anna, "reading");

        Callee callee = new Callee("Hellen");
        Caller caller = new Caller(callee);
        caller.assign("buy a tomato");
    }
}
