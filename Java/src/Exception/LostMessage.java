package Exception;

import util.OutUtil;

/**
 * Created by Ziyun on 2016/8/30.
 */

class ErrorException extends Exception {
    @Override
    public String toString() {
        return "A error exception!";
    }
}

class WarnException extends Exception {
    @Override
    public String toString() {
        return "A warn exception!";
    }
}

class InfoException extends Exception {
    @Override
    public String toString() {
        return "A info exception!";
    }
}

public class LostMessage {
    //  Thinking in Java P269 exercise 18
    private void error() throws ErrorException {
        throw new ErrorException();
    }

    private void warn() throws WarnException {
        throw new WarnException();
    }

    private void info() throws InfoException {
        throw new InfoException();
    }

    private static void exceptionMiss() {
        // 在这种情况下，后面的异常会取代前面的异常被抛出，从而导致前面的异常信息丢失
        try {
            LostMessage lost = new LostMessage();
            try {
                lost.error();
            } finally {
                try {
                    lost.warn();
                } finally {
                    try {
                        lost.info();
                    } finally {
                        OutUtil.print("The third finally block!");
                    }
                }
            }
        } catch (Exception e) {
            OutUtil.print(e.toString());
        }
    }

    private static void untiExceptionMiss() {
        try {
            LostMessage lost = new LostMessage();
            try {
                lost.error();
            } finally {
                try {
                    lost.warn();
                } finally {
                    try {
                        lost.info();
                    } finally {
                        OutUtil.print("The third finally block!");
                    }
                }
            }
        } catch (Exception e) {
            OutUtil.print(e.toString());
        }
    }

    public static void main(String[] args) {
        exceptionMiss();
        untiExceptionMiss();
    }
}
